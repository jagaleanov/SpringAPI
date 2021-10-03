package com.example1.demo1.service;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.User;

public interface UserService {
    User save(UserDto data);
    List <User> findAll();
    Optional <User> findOne (String name);

    List <User> findByInitial(String letra);
}
