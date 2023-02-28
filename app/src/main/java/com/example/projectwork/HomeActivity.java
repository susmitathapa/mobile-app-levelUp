package com.example.projectwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences sharedpreferences=getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username=sharedpreferences.getString("username","").toString();
        Toast.makeText(getApplicationContext(), "Welcome "+username, Toast.LENGTH_SHORT).show();

       CardView computer = findViewById(R.id.computer);
       computer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(HomeActivity.this, ComputerActivity.class);
               startActivity(intent);
           }
       });

        CardView software = findViewById(R.id.software);
        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SoftwareActivity.class);
                startActivity(intent);
            }
        });

        CardView electrical = findViewById(R.id.electrical);
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ElectricalActivity.class);
                startActivity(intent);
            }
        });

        CardView electronics = findViewById(R.id.electricalAndElectronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ElectronicsActivity.class);
                startActivity(intent);
            }
        });

        CardView civil = findViewById(R.id.civil);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, CivilActivity.class);
                startActivity(intent);
            }
        });
        CardView civilRural = findViewById(R.id.civilAndRural);
        civilRural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, CivilRuralActivity.class);
                startActivity(intent);
            }
        });
    }
}