package com.example.clinicalinterviewapp.InterviewData;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterviewQuestion {
    private String userChoice;
    private Map<String,Boolean> answers = new HashMap<String, Boolean>();

    public InterviewQuestion(){

    }

    public void addAnswer(String answer){
        answers.put(answer,false);
    }

    public void removeAnswer(String answer){
        answers.remove(answer);
    }

    public String[] getAnswersList(){
        Set<String> keys = answers.keySet();

        return (String[]) keys.toArray();
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
