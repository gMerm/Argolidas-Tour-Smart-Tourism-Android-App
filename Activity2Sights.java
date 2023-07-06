package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity2Sights extends AppCompatActivity {
    ImageButton btnback;
    private Button arvanitiaButton;
    private Button boatTrip;
    private Button hydraTrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_sights);

        btnback=(ImageButton)findViewById(R.id.imageButton);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2Sights.this, MainActivity.class);
                startActivity(intent);
            }
        });

        arvanitiaButton=(Button)findViewById(R.id.arvanitia);
        arvanitiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArvanitia();
            }
        });

        boatTrip=(Button)findViewById(R.id.boattrip);
        boatTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBoatTrip();
            }
        });

        hydraTrip=(Button)findViewById(R.id.spetsesidra);
        hydraTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpetsesHydra();
            }
        });
    }

    public void onBackPressed(){
        Toast.makeText(Activity2Sights.this, "Please press the back button!", Toast.LENGTH_SHORT).show();
    }

    public void openArvanitia(){
        Intent intent = new Intent(this, Arvanitia.class);
        startActivity(intent);
    }

    public void openBoatTrip(){
        Intent intent = new Intent(this, BoatTrip.class);
        startActivity(intent);
    }

    public void openSpetsesHydra(){
        Intent intent = new Intent(this, SpetsesHydra.class);
        startActivity(intent);
    }
}