package com.example.clinicalinterviewapp.InterviewData;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterviewQuestion {
    private String userChoice;
    private Map<String,Boolean> questions = new HashMap<String, Boolean>();

    public InterviewQuestion(){

    }

    public void addQuestion(String question){
        questions.put(question,false);
    }

    public void removeQuestion(String question){
        questions.remove(question);
    }

    public String[] getQuestionList(){
        Set<String> keys = questions.keySet();

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
