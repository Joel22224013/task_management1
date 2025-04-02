package com.example.task_management.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tasks")
public class Task {
    @Id
    @Column(nullable=false)@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    private String description;

    @Column(nullable=false)
    private boolean completed=false;

    //private LocalDateTime createdAt;
    //private LocalDateTime updatedAt;

    //I am explicitly defining the getters because , it looks like the @ getter annotation is not functioning well in my proect

   public String getDescription(){
       return description;
   }

   public String getTitle() {
       return title;
   }
   public boolean    isCompleted(){
       return completed;
   }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreatedAt(LocalDateTime now) {
    }

    public void setUpdatedAt(LocalDateTime now) {
    }
}
