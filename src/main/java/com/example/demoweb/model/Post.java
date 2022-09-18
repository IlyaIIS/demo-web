package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Date creationDate;

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

    public Post(String text, Date date) {
        this.text = text;
        likes = 0;
        creationDate = date;
    }
}
