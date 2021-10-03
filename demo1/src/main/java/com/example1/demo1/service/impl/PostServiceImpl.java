package com.example1.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import com.example1.demo1.dao.PostDao;
import com.example1.demo1.dto.PostDto;
import com.example1.demo1.model.Post;
import com.example1.demo1.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "postService")
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;
    @Override
    public Post save(PostDto data) {
        Post postToSave = data.getPostFromDto();
        return postDao.save(postToSave);
    }

    @Override
    public List<Post> findAll() {
        return (List<Post>) postDao.findAll();
    }

    @Override
    public Optional<Post> findOne(String name) {
        return postDao.findByTitle(name);
    }
    
}
