package com.example1.demo1.service;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dto.PostDto;
import com.example1.demo1.model.Post;

public interface PostService {
    Post save(PostDto data);

    List<Post> findAll();

    Optional<Post> findOne(String name);
}
