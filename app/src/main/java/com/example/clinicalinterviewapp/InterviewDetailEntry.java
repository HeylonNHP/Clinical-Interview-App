package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.clinicalinterviewapp.InterviewData.InterviewData;

public class InterviewDetailEntry extends AppCompatActivity {

    InterviewData interviewData = new InterviewData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_detail_entry2);
    }

    private void saveInterviewDetails(){
        String interviewDate = ((EditText)findViewById(R.id.interviewDateText)).getText().toString();
        String interviewTime = ((EditText)findViewById(R.id.interviewTimeText)).getText().toString();
        String suburb = ((EditText)findViewById(R.id.suburbText)).getText().toString();

        this.interviewData.setInterviewDate(interviewDate);
        this.interviewData.setInterviewTime(interviewTime);
        this.interviewData.setSuburb(suburb);
    }
}