package com.example1.demo1.service;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dto.CategoryDto;
import com.example1.demo1.model.Category;

public interface CategoryService {
    Category save(CategoryDto data);

    List<Category> findAll();

    Optional<Category> findOne(String name);
}
