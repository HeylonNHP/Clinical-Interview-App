package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clinicalinterviewapp.InterviewData.InterviewData;
import com.example.clinicalinterviewapp.InterviewData.InterviewQuestion;
import com.google.gson.Gson;

public class QuestionScreen extends AppCompatActivity {
    InterviewData interviewData;
    ListView answersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        this.answersList = findViewById(R.id.answersList);
        this.answersList.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        Intent intent = getIntent();

        Gson gson = new Gson();
        this.interviewData = gson.fromJson(intent.getStringExtra("interviewData"),InterviewData.class);

        InterviewQuestion question = this.interviewData.nextQuestion();

        displayQuestion(question);
    }

    private void displayQuestion(InterviewQuestion question){
        TextView questionText = findViewById(R.id.questionTextView);
        questionText.setText(question.getQuestion());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_single_choice,question.getAnswersList());

        this.answersList.setAdapter(adapter);
    }
}