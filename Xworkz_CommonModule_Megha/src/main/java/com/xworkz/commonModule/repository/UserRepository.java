package com.xworkz.commonModule.repository;

import com.xworkz.commonModule.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository {
    public boolean save(UserEntity userEntity);
    public List<UserEntity> getAll(String email, String password);
}
