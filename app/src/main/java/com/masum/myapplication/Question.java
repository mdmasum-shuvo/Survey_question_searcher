package com.masum.myapplication;

public class Question {
    private String questionTitle;
    private String questionId;
    private String selectedId;
    private String parentId;
    private String parentSelectedId;

    public Question(String questionTitle, String questionId, String selectedId, String parentId, String parentSelectedId, Boolean isTrue) {
        this.questionTitle = questionTitle;
        this.questionId = questionId;
        this.selectedId = selectedId;
        this.parentId = parentId;
        this.parentSelectedId = parentSelectedId;
        this.isTrue = isTrue;
    }

    private Boolean isTrue=false;

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Boolean getTrue() {
        return isTrue;
    }

    public String getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(String selectedId) {
        this.selectedId = selectedId;
    }

    public String getParentSelectedId() {
        return parentSelectedId;
    }

    public void setParentSelectedId(String parentSelectedId) {
        this.parentSelectedId = parentSelectedId;
    }

    public void setTrue(Boolean aTrue) {
        isTrue = aTrue;
    }

    public Question(String questionTitle, String questionId, String parentId, Boolean isTrue) {
        this.questionTitle = questionTitle;
        this.questionId = questionId;
        this.parentId = parentId;
        this.isTrue = isTrue;
    }


}
