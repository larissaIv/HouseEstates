package com.example.houseEstates.model.DTO;


import jakarta.validation.constraints.Size;

public class LoginDTO {

    @Size(min = 3, max = 20)
    private String email;

    @Size(min = 3, max = 20)
    private String password;

    public LoginDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
