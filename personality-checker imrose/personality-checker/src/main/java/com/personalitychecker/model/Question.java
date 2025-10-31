package com.personalitychecker.model;

import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<String> options;

    public Question(int id, String question, List<String> options) {
        this.id = id;
        this.question = question;
        this.options = options;
    }

    // Getters
    public int getId() { return id; }
    public String getQuestion() { return question; }
    public List<String> getOptions() { return options; }
}
