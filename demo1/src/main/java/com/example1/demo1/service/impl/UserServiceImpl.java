package com.example1.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dao.UserDao;
import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.User;
import com.example1.demo1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User save(UserDto data) {
        User userToSave = data.getUserFromDto();
        return userDao.save(userToSave);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public Optional<User> findOne(String name) {
        return userDao.findByName(name);
    }

    @Override
    public List<User> findByInitial(String letra) {
        return userDao.findByInitial(letra);
    }
    
}
