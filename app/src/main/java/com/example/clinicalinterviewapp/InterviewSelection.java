package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.clinicalinterviewapp.InterviewData.InterviewData;
import com.google.gson.Gson;

public class InterviewSelection extends AppCompatActivity {
    InterviewData interviewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_selection);

        Intent intent = getIntent();

        Gson gson = new Gson();
        this.interviewData = gson.fromJson(intent.getStringExtra("interviewData"),InterviewData.class);

        System.out.println(this.interviewData.getInterviewDate());
    }
}