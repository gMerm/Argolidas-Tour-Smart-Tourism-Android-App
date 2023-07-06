package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button sightseeings;
    private Button activities;

    private Button cuisine;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= findViewById(R.id.resultLabel);

        SharedPreferences score= getSharedPreferences("sc", Context.MODE_PRIVATE);
        int sco=score.getInt("sc",0);
        textView.setText("Score: "+sco);



        sightseeings=(Button)findViewById(R.id.button_sights);
        sightseeings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySigths();
            }

        });

        activities=(Button)findViewById(R.id.button_activities);
        activities.setEnabled(sco>=3);
        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2Sigths();
            }

        });

        cuisine=(Button)findViewById(R.id.button_cuisine);
        cuisine.setEnabled(sco>=3);
        cuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCuisineSights();
            }

        });

    }
    public void onBackPressed(){
        Toast.makeText(MainActivity.this, "Exit the app!", Toast.LENGTH_SHORT).show();
    }
    public void openActivitySigths(){
        Intent intent = new Intent(this, ActivitySigths.class);
        startActivity(intent);
    }

    public void openActivity2Sigths(){
        Intent intent = new Intent(this, Activity2Sights.class);
        startActivity(intent);
    }
    public void openCuisineSights(){
        Intent intent = new Intent(this, CuisineSights.class);
        startActivity(intent);
    }




}

