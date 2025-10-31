package com.personalitychecker.model;

import java.util.List;

public class AnswerRequest {
    private List<Integer> answers; // user-selected option index for each question

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Integer> answers) {
        this.answers = answers;
    }
}
