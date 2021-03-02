package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.clinicalinterviewapp.InterviewData.Interview;
import com.example.clinicalinterviewapp.InterviewData.InterviewData;
import com.example.clinicalinterviewapp.InterviewData.Interviews;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

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

        ListView listView = findViewById(R.id.interviewList);

        List<Interview> interviewList = new ArrayList<>();
        interviewList.add(Interviews.getMentalStateExaminationInterview());

        ArrayAdapter<Interview> interviewArrayAdapter = new ArrayAdapter<>(this,R.layout.list_item,R.id.listTextView,interviewList);

        listView.setAdapter(interviewArrayAdapter);
        listView.setOnItemClickListener(this::onClickListItem);
    }

    private void onClickListItem(AdapterView<?> adapterView, View view, int position, long l){
        Interview selectedInterview = (Interview) adapterView.getItemAtPosition(position);
        System.out.println(selectedInterview);

        Intent intent = new Intent(this,QuestionScreen.class);

        Gson gson = new Gson();
        String interviewDataJson = gson.toJson(this.interviewData);
        intent.putExtra("interviewData",interviewDataJson);

        startActivity(intent);
    }
}