package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
        posts.add(new Post(0L,"post1", new Date()));
        posts.add(new Post(1L,"post2", new Date()));
        posts.add(new Post(2L,"post3", new Date()));
    }

    public List<Post> listAllPosts(){
        return new ArrayList<>(posts);
    }

    public void create(String text) {
        posts.add(new Post((long)posts.size(), text, new Date()));
    }
}
