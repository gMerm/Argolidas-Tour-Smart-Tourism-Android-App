package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AkronafpliaSight extends AppCompatActivity {
    private Button takeQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akronafplia_sight);

        takeQuiz=(Button)findViewById(R.id.button_learnt);
        takeQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizAkronafplia();
            }
        });
    }
    public void openQuizAkronafplia(){
        Intent intent = new Intent(this, QuizAkronafplia.class);
        startActivity(intent);
    }
}