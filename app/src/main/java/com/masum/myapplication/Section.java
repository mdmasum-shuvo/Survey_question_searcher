package com.masum.myapplication;

import java.util.List;

public class Section {
    String title;
    List<Question> questionList;

    public Section(String title, List<Question> questionList) {
        this.title = title;
        this.questionList = questionList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
