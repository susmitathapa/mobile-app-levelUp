package com.example.projectwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester7);

        CardView ai = findViewById(R.id.artificialIntelligence);
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester7.this, ContentAI.class);
                startActivity(intent);
            }
        });

        CardView cn = findViewById(R.id.computerNetwork);
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester7.this, CN_contents.class);
                startActivity(intent);
            }
        });

        CardView ee = findViewById(R.id.engEco);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester7.this, EE_contents.class);
                startActivity(intent);
            }
        });

        CardView ip = findViewById(R.id.ippr);
        ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester7.this, Ippr_Contents.class);
                startActivity(intent);
            }
        });

        CardView pm = findViewById(R.id.projectManagement);
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester7.this, PM_contents.class);
                startActivity(intent);
            }
        });

        CardView ma = findViewById(R.id.mobile);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Semester7.this, MA_contents.class);
                startActivity(intent);
            }
        });
    }
}