package com.example.houseEstates.config;

import com.example.houseEstates.model.DTO.UserRegisterDTO;
import com.example.houseEstates.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "active", constant = "true")
    UserEntity userDTOToUserEntity(UserRegisterDTO registerDTO);
}
