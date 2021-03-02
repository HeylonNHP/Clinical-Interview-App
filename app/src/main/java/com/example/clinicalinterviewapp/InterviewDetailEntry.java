package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.clinicalinterviewapp.InterviewData.InterviewData;
import com.google.gson.Gson;

public class InterviewDetailEntry extends AppCompatActivity {

    InterviewData interviewData = new InterviewData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_detail_entry2);

        ((Button)findViewById(R.id.nextButton)).setOnClickListener(this::nextButtonClick);
    }

    private void saveInterviewDetails(){
        String interviewDate = ((EditText)findViewById(R.id.interviewDateText)).getText().toString();
        String interviewTime = ((EditText)findViewById(R.id.interviewTimeText)).getText().toString();
        String suburb = ((EditText)findViewById(R.id.suburbText)).getText().toString();

        this.interviewData.setInterviewDate(interviewDate);
        this.interviewData.setInterviewTime(interviewTime);
        this.interviewData.setSuburb(suburb);
    }

    private void nextButtonClick(View e){
        saveInterviewDetails();

        Intent nextActivity = new Intent(this,InterviewSelection.class);

        Gson gson = new Gson();
        String interviewDataJson = gson.toJson(this.interviewData);
        nextActivity.putExtra("interviewData",interviewDataJson);

        startActivity(nextActivity);

        // TODO: Goto next activity
    }
}