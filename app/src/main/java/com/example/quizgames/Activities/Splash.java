package com.example.quizgames.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.airbnb.lottie.LottieAnimationView;
import com.example.quizgames.MainActivity;
import com.example.quizgames.R;

public class Splash extends AppCompatActivity {

    LottieAnimationView big, loading;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        loading=findViewById(R.id.loading);
        big=findViewById(R.id.reading);
        loading.playAnimation();
        big.playAnimation();
        CountDownTimer timer= new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent=new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        timer.start();

    }
}