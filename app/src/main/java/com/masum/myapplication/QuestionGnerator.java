package com.masum.myapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionGnerator {

    static List<Section> sectionList = new ArrayList();
    static List<Question> questionList = new ArrayList();

    public static List<Question> generateQuestionList() {

        questionList.add(new Question("Q1", "1", "1", null, null, false));
        questionList.add(new Question("Q2", "2", "1", null, null, false));
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

    public static List<Section> generateSectionQuestionList() {

        questionList.add(new Question("Q1", "1", "1", null, null, false));
        questionList.add(new Question("Q2", "2", "1", null, null, false));
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

        sectionList.add(new Section("section 1", questionList));
        sectionList.add(new Section("section 2", questionList));
        sectionList.add(new Section("section 3", questionList));
        sectionList.add(new Section("section 4", questionList));

        return sectionList;
    }

    public static List<Question> getSectionQuestionList(int sectionPosition) {
        return sectionList.get(sectionPosition).questionList;
    }
}
