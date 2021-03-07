package com.example.clinicalinterviewapp.InterviewData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterviewQuestion {
    private String userChoice;
    private String question;
    private String category;
    private Map<String,Boolean> answers = new HashMap<String, Boolean>();

    public InterviewQuestion(){

    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return this.question;
    }

    public void addAnswer(String answer){
        answers.put(answer,false);
    }

    public void removeAnswer(String answer){
        answers.remove(answer);
    }

    public String[] getAnswersList(){
        List<String> keyList = new ArrayList<>(answers.keySet());

        String[] stringKeyList = new String[keyList.size()];

        for(int i = 0; i < keyList.size(); ++i){
            stringKeyList[i] = keyList.get(i);
        }

        return (String[]) stringKeyList;
    }

    public void setUserChoice(String userChoice){
        this.userChoice = userChoice;
    }

    public String getUserChoice(){
        return this.userChoice;
    }

    public void resetUserChoice(){
        this.userChoice = null;
    }
}
