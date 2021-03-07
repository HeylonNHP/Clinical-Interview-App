package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.clinicalinterviewapp.InterviewData.InterviewData;
import com.example.clinicalinterviewapp.InterviewData.InterviewQuestion;
import com.google.gson.Gson;

public class QuestionScreen extends AppCompatActivity {
    InterviewData interviewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        Intent intent = getIntent();

        Gson gson = new Gson();
        this.interviewData = gson.fromJson(intent.getStringExtra("interviewData"),InterviewData.class);

        InterviewQuestion question = this.interviewData.nextQuestion();


    }
}