package com.example.task_management.controller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Authentication request model")

public class AuthenticationRequest {
    @Schema(description = "Username or email for authentication", example = "ansahjoel318@gmail.com")
    private String email;

    @Schema(description = "User password", example = "password123")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
