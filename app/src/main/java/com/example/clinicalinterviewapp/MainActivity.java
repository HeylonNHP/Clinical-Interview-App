package com.example.clinicalinterviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.button);

        startButton.setOnClickListener(this::switchToInterviewDetailEntry);
    }

    private void switchToInterviewDetailEntry(View e){
        Intent newIntent = new Intent(this,InterviewDetailEntry.class);
        startActivity(newIntent);
    }
}