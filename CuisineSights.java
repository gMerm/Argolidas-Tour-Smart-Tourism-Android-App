package com.example.dokimi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CuisineSights extends AppCompatActivity {
    ImageButton btnback;
    private Button gelatoButton;
    private Button coffeeButton;
    private Button tavernsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_sights);

        gelatoButton=(Button)findViewById(R.id.italiangelato);
        gelatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGelato();
            }
        });



        tavernsButton=(Button)findViewById(R.id.streetfood);
        tavernsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStreetFood();
            }
        });
    }

    public void onBackPressed(){
        Toast.makeText(CuisineSights.this, "Please press the back button!", Toast.LENGTH_SHORT).show();
    }

    public void openGelato(){
        Intent intent = new Intent(this, Gelato.class);
        startActivity(intent);
    }



    public void openStreetFood(){
        Intent intent = new Intent(this, StreetFood.class);
        startActivity(intent);
    }
}