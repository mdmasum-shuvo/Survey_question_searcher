package com.masum.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    Stack<Integer> stack = new Stack<>();
    List<Question> questionList;
    List<Section> sectionList = QuestionGnerator.generateSectionQuestionList();
    ArrayList<Integer> founderQuestionList = new ArrayList<>();
    int questionPosition = 0;
    int currentStack = 0;
    ArrayList<Question> independentList = new ArrayList<>();

    int completeIndIndex = 1;
    boolean isfinishedTravarse = false;
    int tree = 0;
    int sectionVisit = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionList = sectionList.get(sectionVisit).getQuestionList();
        independentQuestionList(questionList);
        Button button = findViewById(R.id.btn_search);
        button.setOnClickListener(v -> {
            searcingalgorithm();
        });
    }

    private void searcingalgorithm() {

        if (stack.isEmpty()) {
            if (tree > independentList.size() - 1) {
                Log.e("search", "finish All");
            } else {
                Question currentLIst = independentList.get(tree);

                questionPosition = searchIndependentQuestion(currentLIst, questionList);
                stack.push(questionPosition);
                currentStack = stack.peek();
                Log.e("search", String.valueOf(questionList.get(questionPosition).getQuestionTitle()));
                //independentList.get(questionPosition);
                tree++;
                isfinishedTravarse = false;
            }

        } else {
            if (!isfinishedTravarse)
                travarseQuestion();
            if (stack.isEmpty()) {
                if (tree > independentList.size() - 1) {
                    if (!independentList.isEmpty()) {
                        independentList.clear();
                    }
                    sectionVisit++;
                    if (sectionVisit >= sectionList.size()) {
                        Log.e("search", "finish All section");
                        return;
                    }
                    questionList = sectionList.get(sectionVisit).getQuestionList();
                    independentQuestionList(questionList);
                    if (!founderQuestionList.isEmpty()) {
                        founderQuestionList.clear();
                    }
                    tree = 1;
                    stack.clear();
                    stack.push(0);
                    currentStack = stack.peek();
                    Log.e("search", "finish All");
                    Log.e("search", String.valueOf(questionList.get(currentStack).getQuestionTitle()));
                    // searcingalgorithm();
                } else {
                    isfinishedTravarse = false;
                    Log.e("search", "finish game");
                    Question currentLIst = independentList.get(tree);

                    questionPosition = searchIndependentQuestion(currentLIst, questionList);
                    stack.push(questionPosition);
                    currentStack = stack.peek();
                    Log.e("search", String.valueOf(questionList.get(questionPosition).getQuestionTitle()));
                    //independentList.get(questionPosition);
                    tree++;
                }
            } else {
                currentStack = stack.peek();
                Log.e("search", String.valueOf(questionList.get(questionPosition).getQuestionTitle()));
            }
        }
    }

    private void travarseQuestion() {
        questionPosition = searchingNextQuestionPosition(questionList.get(currentStack), questionList);
        if (questionPosition < 0) {
            stack.pop();
            if (!stack.isEmpty()) {
                currentStack = stack.peek();
                travarseQuestion();
            }
        } else {
            stack.push(questionPosition);
        }


    }


    public int searchingNextQuestionPosition(Question question, List<Question> questionList) {
        int i = 0;
        while (i < questionList.size()) {
            if (question.getQuestionId().equals(questionList.get(i).getParentId()) &&
                    question.getSelectedId().equals(questionList.get(i).getParentSelectedId())) {
                if (!checkFoundedQuestionIndex(i)) {
                    founderQuestionList.add(i);
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public Boolean checkFoundedQuestionIndex(int searchindex) {
        for (int i = 0; i < founderQuestionList.size(); i++) {
            if (founderQuestionList.get(i) == searchindex) {
                return true;
            }
        }
        return false;
    }

    public int searchIndependentQuestion(Question indList, List<Question> questionList) {
        for (int i = 0; i < questionList.size(); i++) {
            if (Objects.equals(questionList.get(i).getQuestionId(), indList.getQuestionId())) {
                return i;
            }
        }

        return -1;
    }

    public void independentQuestionList(List<Question> questionList) {
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i < questionList.size(); i++) {
            if (questionList.get(i).getParentId() == null) {
                independentList.add(questionList.get(i));
            }
        }


    }
}