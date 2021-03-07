package com.example.clinicalinterviewapp.InterviewData;

import java.util.ArrayList;
import java.util.List;

public class InterviewData {
    private String interviewDate;
    private String interviewTime;
    private String suburb;

    private Interview interview;
    int currentQuestionIndex = -1;

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

    public void setInterview(Interview interview){
        this.interview = interview;
    }

    public Interview getInterview(){
        return this.interview;
    }

    public InterviewQuestion getQuestion(int index){
        return this.interview.getQuestion(index);
    }

    public InterviewQuestion nextQuestion() throws Exception{
        this.currentQuestionIndex++;
        if(this.interview.getQuestionList().size() <= this.currentQuestionIndex){
            throw new Exception("Out of range");
        }
        return this.interview.getQuestion(this.currentQuestionIndex);
    }

    public InterviewQuestion previousQuestion() throws Exception{
        this.currentQuestionIndex--;
        if(this.currentQuestionIndex < 0){
            throw new Exception("Out of range");
        }
        return this.interview.getQuestion(this.currentQuestionIndex);
    }

}
