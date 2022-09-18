package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Date creationDate;
    private Long id;

    private Integer likes;

    public String getText() {
        return text;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Integer getLikes() {
        return likes;
    }
    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        likes = 0;
        creationDate = date;
    }
}
