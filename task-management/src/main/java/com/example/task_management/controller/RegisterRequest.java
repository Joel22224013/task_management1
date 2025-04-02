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
@Schema(description = "User registration request model")

public class RegisterRequest {
    @Schema(description = "Username", example = "Joel")
    private String username;

   @Schema(description = "Email address", example = "ansahjoel318@example.com")
    private String email;

    @Schema(description = "Password", example = "password123")
    private String password;

    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
}
