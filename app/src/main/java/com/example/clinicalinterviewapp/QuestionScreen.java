package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clinicalinterviewapp.InterviewData.InterviewData;
import com.example.clinicalinterviewapp.InterviewData.InterviewQuestion;
import com.google.gson.Gson;

public class QuestionScreen extends AppCompatActivity {
    InterviewData interviewData;
    ListView answersList;
    InterviewQuestion currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        this.answersList = findViewById(R.id.answersList);
        this.answersList.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        this.answersList.setOnItemClickListener(this::onClickListItem);

        Intent intent = getIntent();

        Gson gson = new Gson();
        this.interviewData = gson.fromJson(intent.getStringExtra("interviewData"),InterviewData.class);

        InterviewQuestion question = this.interviewData.nextQuestion();
        this.currentQuestion = question;
        displayQuestion(question);
    }

    private void onClickListItem(AdapterView<?> adapterView, View view, int i, long l) {
        SparseBooleanArray checkedItems = answersList.getCheckedItemPositions();

        System.out.println(checkedItems);

        for(int iter = 0; iter < checkedItems.size(); ++iter){
            int key = checkedItems.keyAt(iter);

            System.out.println("Key:" + key + " Value:" + checkedItems.get(key) + " Ans:" + answersList.getItemAtPosition(key));
            this.currentQuestion.setUserChoice(answersList.getItemAtPosition(key).toString());
        }
    }

    private void displayQuestion(InterviewQuestion question){
        TextView questionText = findViewById(R.id.questionTextView);
        questionText.setText(question.getQuestion());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_single_choice,question.getAnswersList());

        this.answersList.setAdapter(adapter);
    }
}