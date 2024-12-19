package com.xworkz.commonModule.service;

import com.xworkz.commonModule.dto.UserDto;
import com.xworkz.commonModule.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public boolean validateAndSave(UserDto dto);

    public String generatePassword();

    public List<UserEntity> getAll(String email, String password);

}
