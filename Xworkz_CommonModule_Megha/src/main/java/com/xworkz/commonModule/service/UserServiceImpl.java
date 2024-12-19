package com.xworkz.commonModule.service;

import com.xworkz.commonModule.dto.UserDto;
import com.xworkz.commonModule.entity.UserEntity;
import com.xworkz.commonModule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean validateAndSave(UserDto dto) {
        System.out.println("data in service===" + dto);
        String password = generatePassword();
        System.out.println(password);
        UserEntity userEntity = new UserEntity();
        userEntity.setName(dto.getName());
        userEntity.setEmail(dto.getEmail());
        userEntity.setPhoneNumber(dto.getPhoneNumber());
        userEntity.setAlternateEmail(dto.getAlternateEmail());
        userEntity.setAlternatePhoneNumber(dto.getAlternatePhoneNumber());
        userEntity.setLocation(dto.getLocation());
        if(userEntity.getEmail()!=null) {
            userEntity.setPassword(password);
        }
        boolean saved = userRepository.save(userEntity);
        if (saved) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String generatePassword() {
        int passwordLength = 6; // Example: 6-digit password
        Random random = new Random();
        int firstDigit = 1 + random.nextInt(9);
        StringBuilder password = new StringBuilder(String.valueOf(firstDigit));
        for (int i = 1; i < passwordLength; i++) {
            password.append(random.nextInt(10));
        }
        return password.toString();
    }
    @Override
    public List<UserEntity> getAll(String email, String password)
    {
        List<UserEntity> list=userRepository.getAll(email,password);
        if(list!=null)
        {
            return list;
        }

        return null;
    }

}
