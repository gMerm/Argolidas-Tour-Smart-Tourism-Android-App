package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizPorto extends AppCompatActivity {
    RadioGroup radioGroup, radioGroup1;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    RadioButton radioButton21, radioButton22, radioButton23, radioButton24;

    Button learnt;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_porto);

        radioGroup = findViewById(R.id.radioGroup1);
        radioButton1 = findViewById(R.id.option1a_radiobutton);
        radioButton2 = findViewById(R.id.option1b_radiobutton);
        radioButton3 = findViewById(R.id.option1c_radiobutton);
        radioButton4 = findViewById(R.id.option1d_radiobutton);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton=findViewById(checkedId);
                if(selectedRadioButton.getId()==R.id.option1a_radiobutton){
                    System.out.println("Congratulations! You chose the correct answer.");
                    SharedPreferences score= getSharedPreferences("sc", Context.MODE_PRIVATE);
                    int sco=score.getInt("sc",0);

                    sco++;
                    SharedPreferences.Editor editor=score.edit();
                    editor.putInt("sc",sco);
                    editor.commit();
                    // Display a toast message on the screen
                    Toast.makeText(QuizPorto.this, "Congratulations! You chose the correct answer.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizPorto.this, ActivitySigths.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(QuizPorto.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        System.out.println(score);
    }
}