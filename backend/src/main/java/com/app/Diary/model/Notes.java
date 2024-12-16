package com.app.Diary.model;

import org.springframework.data.annotation.Id;

public class Notes {
    @Id
    private String textNote;

    public String getText() {
        return textNote;
    }

    public void setText(String text) {
        this.textNote = text;
    }
}
