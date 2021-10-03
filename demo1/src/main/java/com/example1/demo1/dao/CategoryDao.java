package com.example1.demo1.dao;

import java.util.Optional;

import com.example1.demo1.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CategoryDao extends CrudRepository <Category, Long>  {
    Optional<Category> findById(Long id);
    Optional <Category> findByName(String name);   
}