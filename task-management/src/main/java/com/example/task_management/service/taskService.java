package com.example.task_management.service;
import com.example.task_management.Exception.ResourceNotFoundException;
import com.example.task_management.model.Task;
import com.example.task_management.repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter

@Service

public class taskService {
    @Autowired
    private final taskRepository taskRepo;
    private final EmailService emailService;


    public taskService(taskRepository taskRepo, EmailService emailService) {
        this.taskRepo = taskRepo;
        this.emailService = emailService;
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
    public Task getTaskById(Long id){
        return taskRepo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Task not found "+ id));
    }

    public Task createTask(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(LocalDateTime.now());
        Task savedTask = taskRepo.save(task);

        // Send Email Notification
        String emailBody = "<h2>New Task Created</h2>"
                + "<p><b>Title:</b> " + task.getTitle() + "</p>"
                + "<p><b>Description:</b> " + task.getDescription() + "</p>";
        emailService.sendEmail("ansahjoel318@gmail.com", "Task Created: " + task.getTitle(), emailBody);

        return savedTask;
    }
    public Task updateTask(Long id, Task updatedTask) {
        return taskRepo.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepo.save(task);
        }).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public void deleteTask(Long id){
        if(!taskRepo.existsById(id)){
            throw new ResourceNotFoundException("Task not found "+ id);
        }
        taskRepo.deleteById(id);
    }

}
