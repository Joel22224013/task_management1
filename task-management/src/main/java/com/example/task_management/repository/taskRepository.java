package com.example.task_management.repository;
import com.example.task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface taskRepository extends JpaRepository<Task,Long> {

}
