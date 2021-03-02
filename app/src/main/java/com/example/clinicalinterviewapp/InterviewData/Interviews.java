package com.example.clinicalinterviewapp.InterviewData;

public class Interviews {

    public static Interview getMentalStateExaminationInterview(){
        Interview interview = new Interview();
        interview.setTitle("Mental State Examination Interview");

        String category = "Appearance";

        InterviewQuestion question = new InterviewQuestion();

        question.setCategory(category);
        question.setQuestion("Stature");

        question.addAnswer("Average");
        question.addAnswer("Small");
        question.addAnswer("Tall");

        interview.addQuestion(question);

        question = new InterviewQuestion();

        question.setCategory(category);
        question.setQuestion("Weight for size");

        question.addAnswer("Average weight");
        question.addAnswer("Overweight");
        question.addAnswer("Obese");
        question.addAnswer("Underweight");

        interview.addQuestion(question);

        return interview;
    }

}
