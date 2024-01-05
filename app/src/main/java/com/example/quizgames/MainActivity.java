package com.example.quizgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.quizgames.Activities.QuizActivity;
import com.example.quizgames.Activities.quizinfo;

public class MainActivity extends AppCompatActivity {


    private ImageView sound;
    private String selectedTopicName = "";

    QuizActivity quizActivity;
    Toast toast;
    private boolean isSoundActive = false;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout matem = findViewById(R.id.matemm);
        final LinearLayout onat = findViewById(R.id.onatili);
        final LinearLayout tarix = findViewById(R.id.tarix);
        sound = findViewById(R.id.sound);
        sound.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
        sound.setBackgroundResource(R.drawable.mute);


        final Button buttonstr = findViewById(R.id.testboshlash);

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSoundActive) {
                    isSoundActive = false;
                    mediaPlayer.reset();
                    sound.setBackground(null);
                    sound.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                    sound.setBackgroundResource(R.drawable.mute);
                }
                else {
                    isSoundActive = true;
                    sound.setBackground(null);
                    sound.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                    sound.setBackgroundResource(R.drawable.unmute);
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yy);
                    mediaPlayer.start();
                }
            }
        });

        matem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Matematika";
                playSound();
                matem.setBackgroundResource(R.drawable.round_black_white_stroce10);
                onat.setBackgroundResource(R.drawable.round_back_10);
                tarix.setBackgroundResource(R.drawable.round_back_10);

            }
        });

        onat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Ona tili";
                playSound();
                onat.setBackgroundResource(R.drawable.round_black_white_stroce10);

                matem.setBackgroundResource(R.drawable.round_back_10);
                tarix.setBackgroundResource(R.drawable.round_back_10);

            }
        });
        tarix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Tarix";
                playSound();
                tarix.setBackgroundResource(R.drawable.round_black_white_stroce10);

                matem.setBackgroundResource(R.drawable.round_back_10);
                onat.setBackgroundResource(R.drawable.round_back_10);

            }
        });


        buttonstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();
                if (selectedTopicName.isEmpty()) {
                    if (toast != null) {
                        toast.cancel();
                    } else {
                        toast = Toast.makeText(MainActivity.this, "Fan tanlashni unutdingiz!", Toast.LENGTH_SHORT);
                    }
                    toast.show();

                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    intent.putExtra("sound", isSoundActive);
                    startActivity(intent);
                }
            }
        });
    }

    public void infoLayout(View view) {
        playSound();
        Intent intent = new Intent(MainActivity.this, quizinfo.class);
        intent.putExtra("sound", isSoundActive);
        startActivity(intent);
    }

    private void playSound() {
        if (mediaPlayer != null)
            mediaPlayer.start();
    }
}