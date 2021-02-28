package com.example.clinicalinterviewapp.InterviewData;

import java.util.ArrayList;
import java.util.List;

public class InterviewData {
    private String interviewDate;
    private String interviewTime;
    private String suburb;

    private final List<InterviewQuestion> questionList = new ArrayList<InterviewQuestion>();
    int currentQuestionIndex = 0;

    public InterviewData(){

    }

    public void setInterviewDate(String date){
        this.interviewDate = date;
    }

    public void setInterviewTime(String time){
        this.interviewTime = time;
    }

    public void setSuburb(String suburb){
        this.suburb = suburb;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public String getSuburb() {
        return suburb;
    }

    public void addQuestion(InterviewQuestion question){
        this.questionList.add(question);
    }

    public void removeQuestion(int index){
        this.questionList.remove(index);
    }

    public InterviewQuestion getQuestion(int index){
        return this.questionList.get(index);
    }

    public InterviewQuestion nextQuestion(){
        this.currentQuestionIndex++;
        return this.questionList.get(this.currentQuestionIndex);
    }

    public InterviewQuestion previousQuestion(){
        this.currentQuestionIndex--;
        return this.questionList.get(this.currentQuestionIndex);
    }

}
