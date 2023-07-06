package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PortoSight extends AppCompatActivity {
    private Button takeQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porto_sight);
        takeQuiz=(Button)findViewById(R.id.button_learnt);
        takeQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizPort();
            }
        });
    }
    public void openQuizPort(){
        Intent intent = new Intent(this, QuizPorto.class);
        startActivity(intent);
    }
}