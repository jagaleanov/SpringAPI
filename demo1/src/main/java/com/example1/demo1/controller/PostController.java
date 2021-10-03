package com.example1.demo1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example1.demo1.dto.PostDto;
import com.example1.demo1.model.Post;
import com.example1.demo1.service.impl.PostServiceImpl;

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
@RequestMapping("/Post")
public class PostController {
    @Autowired
    private PostServiceImpl PostService;

    @PostMapping(value="/create")
    public Post save( @RequestBody PostDto Post, HttpServletResponse response ) throws IOException{
        return PostService.save(Post);
    }
    @GetMapping("/list")
    public List<Post> list(){
        return PostService.findAll();
    }
    @GetMapping("/perTitle/{title}")
    public Post perTitle( @PathVariable(value="title") String title ){
        return PostService.findOne(title).get();
    }
}
