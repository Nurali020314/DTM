package com.example.quizgames.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.quizgames.R;

public class quizinfo extends AppCompatActivity {
    MediaPlayer mp;
       private boolean isSoundActive;
    ImageView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizinfo);

        isSoundActive = getIntent().getBooleanExtra("sound", false);
        if (isSoundActive)
            mp = MediaPlayer.create(this, R.raw.yy);

        exit=findViewById(R.id.infoexit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();
                finish();
            }
        });
    }
    private void playSound(){
        if (mp != null)
            mp.start();
    }


}