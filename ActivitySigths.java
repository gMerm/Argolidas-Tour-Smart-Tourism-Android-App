package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class ActivitySigths extends AppCompatActivity {
    ImageButton btnback;
    private Button palamidiButton;
    private Button mpourtziButton;

    private Button akronafpliaButton;

    private Button pyliButton;
    private Button mykinesButton;
    private Button portoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigths);

        palamidiButton=(Button)findViewById(R.id.palamidi);
        palamidiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPalamidiSight();
            }
        });

        mpourtziButton=(Button)findViewById(R.id.mpourtzi);
        mpourtziButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMpourtziSight();
            }
        });

        akronafpliaButton=(Button)findViewById(R.id.akronafplia);
        akronafpliaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAkronafpliaiSight();
            }
        });

        pyliButton=(Button)findViewById(R.id.pyli);
        pyliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPyliSight();
            }
        });

        mykinesButton=(Button)findViewById(R.id.mikines);
        mykinesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMikinesiSight();
            }
        });

        portoButton=(Button)findViewById(R.id.portoxeli);
        portoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPortoSight();
            }
        });

        btnback=(ImageButton)findViewById(R.id.imageButton);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySigths.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    public void onBackPressed(){
        Toast.makeText(ActivitySigths.this, "Please press the back button!", Toast.LENGTH_SHORT).show();
    }
    public void openPalamidiSight(){
        Intent intent = new Intent(this, PalamidiSight.class);
        startActivity(intent);
    }

    public void openMpourtziSight(){
        Intent intent = new Intent(this, MpourtziSight.class);
        startActivity(intent);
    }

    public void openAkronafpliaiSight(){
        Intent intent = new Intent(this, AkronafpliaSight.class);
        startActivity(intent);
    }

    public void openPyliSight(){
        Intent intent = new Intent(this, PyliSight.class);
        startActivity(intent);
    }

    public void openMikinesiSight(){
        Intent intent = new Intent(this, MikinesSight.class);
        startActivity(intent);
    }

    public void openPortoSight(){
        Intent intent = new Intent(this, PortoSight.class);
        startActivity(intent);
    }
}