package com.example1.demo1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example1.demo1.dto.CategoryDto;
import com.example1.demo1.model.Category;
import com.example1.demo1.service.impl.CategoryServiceImpl;

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
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl CategoryService;

    @PostMapping(value="/create")
    public Category save( @RequestBody CategoryDto category, HttpServletResponse response ) throws IOException{
        return CategoryService.save(category);
    }
    @GetMapping("/list")
    public List<Category> list(){
        return CategoryService.findAll();
    }
    @GetMapping("/perName/{name}")
    public Category perName( @PathVariable(value="name") String name ){
        return CategoryService.findOne(name).get();
    }
}
