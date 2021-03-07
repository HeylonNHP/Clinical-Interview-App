package com.example.clinicalinterviewapp.InterviewData;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    private List<InterviewQuestion> questionList = new ArrayList<>();
    private String interviewTitle;
    public Interview(){

    }

    public void addQuestion(InterviewQuestion question){
        questionList.add(question);
    }

    public void removeQuestion(InterviewQuestion question){
        questionList.remove(question);
    }

    public InterviewQuestion getQuestion(int index){
        return questionList.get(index);
    }

    public List<InterviewQuestion> getQuestionList(){
        return questionList;
    }

    public void setTitle(String title){
        this.interviewTitle = title;
    }

    public String getTitle(){
        return this.interviewTitle;
    }

    @Override
    public String toString() {
        return this.interviewTitle;
    }
}
