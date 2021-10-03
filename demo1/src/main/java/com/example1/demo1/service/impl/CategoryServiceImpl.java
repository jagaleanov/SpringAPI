package com.example1.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dao.CategoryDao;
import com.example1.demo1.dto.CategoryDto;
import com.example1.demo1.model.Category;
import com.example1.demo1.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public Category save(CategoryDto data) {
        Category categoryToSave = data.getCategoryFromDto();
        return categoryDao.save(categoryToSave);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryDao.findAll();
    }

    @Override
    public Optional<Category> findOne(String name) {
        return categoryDao.findByName(name);
    }
    
}
