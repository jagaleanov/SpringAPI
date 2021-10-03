package com.example1.demo1.dao;

import java.util.Optional;

import com.example1.demo1.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.CrudRepository;

@Service
public interface PostDao extends CrudRepository <Post, Long>  {
    Optional<Post> findByTitle(String name);
    Optional<Post> findByCategory(long category_id);
}