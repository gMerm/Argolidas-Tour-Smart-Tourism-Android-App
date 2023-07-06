package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PalamidiSight extends AppCompatActivity {
    private Button takeQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palamidi_sight);

        takeQuiz=(Button)findViewById(R.id.button_learnt);
        takeQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizPalamidi();
            }
        });

    }

    public void openQuizPalamidi(){
        Intent intent = new Intent(this, QuizPalamidi.class);
        startActivity(intent);
    }
}