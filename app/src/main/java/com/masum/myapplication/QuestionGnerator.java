package com.masum.myapplication;

import java.util.ArrayList;

public class QuestionGnerator {
    public static ArrayList<Question> generateQuestionList() {
        ArrayList questionList = new ArrayList();
        questionList.add(new Question("Q1", "1", "1", null, null, false));
        questionList.add(new Question("Q2", "2", "1",null,null, false));
        questionList.add(new Question("Q3", "3", "1", "1", "1", true));
        questionList.add(new Question("Q4", "4", "1", "1", "1", true));
        questionList.add(new Question("Q5", "5", "1", "1", "1", true));
        questionList.add(new Question("Q6", "6", "1", false));
        questionList.add(new Question("Q7", "7", "2", null, null, true));
        questionList.add(new Question("Q8", "8", "1", false));
        questionList.add(new Question("Q9", "9", "1", "7", "1", true));
        questionList.add(new Question("Q10", "10", "1", "7", "2", false));
        questionList.add(new Question("Q11", "11", "1", "9", "1", true));
        questionList.add(new Question("Q12", "12", "1", "3", "1", true));
        questionList.add(new Question("Q13", "13", "1", "9", "1", true));
        questionList.add(new Question("Q14", "14", "9", false));
        questionList.add(new Question("Q15", "15", "1", "9", "1", true));
        questionList.add(new Question("Q16", "16", "1", "5", "1", true));
        questionList.add(new Question("Q17", "17", "1", "7", "1", true));
        questionList.add(new Question("Q18", "18", "1", "3", "1", true));
        questionList.add(new Question("Q19", "19", null, false));
        questionList.add(new Question("Q20", "20", "1", "2", "1", false));
        return questionList;
    }
}
