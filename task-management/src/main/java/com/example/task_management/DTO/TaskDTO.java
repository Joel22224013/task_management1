package com.example.task_management.DTO;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(callSuper = false)

public class TaskDTO {
@NotBlank(message = "Title is required")
    private String title;
    private String description;
    private boolean completed;
}
