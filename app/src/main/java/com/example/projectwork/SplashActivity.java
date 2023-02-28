package com.example.projectwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private TextView lets_practice;

    private static final int SPLASH_TIME_OUT = 3000; // splash screen duration in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        lets_practice=findViewById(R.id.lets_practice);

        Animation anim= AnimationUtils.loadAnimation(this,R.anim.myanim);
        lets_practice.setAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // close the splash activity to prevent the user from going back to it
            }
        }, SPLASH_TIME_OUT);
    }
}