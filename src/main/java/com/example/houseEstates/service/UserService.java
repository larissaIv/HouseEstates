package com.example.houseEstates.service;

import com.example.houseEstates.model.DTO.UserRegisterDTO;
import com.example.houseEstates.model.entity.UserEntity;

public interface UserService {

    void save(UserEntity user);
    UserRegisterDTO getUserByEmail(String email);
}
