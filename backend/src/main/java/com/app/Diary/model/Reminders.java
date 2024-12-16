package com.app.Diary.model;

import org.springframework.data.annotation.Id;

public class Reminders {
    @Id
    private String title;
    private String textReminder;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextReminder() {
        return textReminder;
    }

    public void setTextReminder(String textReminder) {
        this.textReminder = textReminder;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
