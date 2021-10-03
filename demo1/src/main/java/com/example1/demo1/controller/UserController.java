package com.example1.demo1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.User;
import com.example1.demo1.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl UserService;

    @PostMapping(value="/create")
    public User save( @RequestBody UserDto user, HttpServletResponse response ) throws IOException{
        return UserService.save(user);
    }
    @GetMapping("/list")
    public List<User> list(){
        return UserService.findAll();
    }
    @GetMapping("/perName/{name}")
    public User perName( @PathVariable(value="name") String name ){
        return UserService.findOne(name).get();
    }
    @GetMapping("/perLetter/{letter}")
    public List <User> perLetter( @PathVariable(value="letter") String letter ){
        return UserService.findByInitial(letter);
    }
}
