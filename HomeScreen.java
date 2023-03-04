package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeScreen extends AppCompatActivity {

    ImageButton remainderIMG,refilIMG,pillIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        remainderIMG = findViewById(R.id.remainderIMG);
        remainderIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(HomeScreen.this,RemainderScreen.class);
                startActivity(in);


            }
        });
        refilIMG = findViewById(R.id.refilIMG);
        refilIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(HomeScreen.this,RefillsScreen.class);
                startActivity(in);


            }
        });

        pillIMG = findViewById(R.id.pillIMG);
        pillIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(HomeScreen.this,MedicineDetails.class);
                startActivity(in);


            }
        });
    }
}