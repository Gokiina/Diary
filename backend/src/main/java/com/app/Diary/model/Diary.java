package com.app.Diary.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Diary {
    @Id
    private String id;
    private LocalDateTime date;
    private String content;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
