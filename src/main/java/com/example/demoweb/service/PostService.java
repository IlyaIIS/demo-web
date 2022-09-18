package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    public List<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<>();
        list.add(new Post("post1", new Date()));
        list.add(new Post("post2", new Date()));
        list.add(new Post("post3", new Date()));
        return list;
    }
}
