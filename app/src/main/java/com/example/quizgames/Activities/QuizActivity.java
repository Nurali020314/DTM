package com.example.quizgames.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizgames.MainActivity;
import com.example.quizgames.R;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Timer;

public class QuizActivity extends AppCompatActivity {
    private TextView questions;
    private TextView question;
    private Toast toast;


    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextbtn;

    // private Timer quiztimer;
    //  private int totalTimeInmins = 1;
    // private int second = 0;

    private TextView downTimer;
    CountDownTimer time;
    private List<QuestinsList> allquestions;
    private int correctQuestionPosition = 0;

    private String selectedOptionByUser = "";

    private boolean isSoundActive;
    private MediaPlayer mp;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        final ImageView backbtn = findViewById(R.id.backbtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopic = findViewById(R.id.topicname);

        questions = findViewById(R.id.questions);
        question = findViewById(R.id.questionwil);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);



        downTimer = findViewById(R.id.timer);

        startTime(timer);
        nextbtn = findViewById(R.id.nextbtn);
        final String getSelectedTopinNmae = getIntent().getStringExtra("selectedTopic");
        isSoundActive = getIntent().getBooleanExtra("sound", false);
        if (isSoundActive)
            mp = MediaPlayer.create(this, R.raw.yy);

        selectedTopic.setText(getSelectedTopinNmae);
        //startTime(timer);

        allquestions = QuestionBank.getQuestions(getSelectedTopinNmae);
        Collections.shuffle(allquestions);
        questions.setText((correctQuestionPosition + 1) + "/" + allquestions.size());
        question.setText(allquestions.get(0).getQuestion());
        option1.setText(allquestions.get(0).getOption1());
        option2.setText(allquestions.get(0).getOption2());
        option3.setText(allquestions.get(0).getOption3());
        option4.setText(allquestions.get(0).getOption4());



        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    playSound();
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_red10);
                    option1.setTextColor(Color.WHITE);
                    realAnswer();
                    allquestions.get(correctQuestionPosition).setUserselectedanswer(selectedOptionByUser);
                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()) {
                    playSound();
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_red10);
                    option2.setTextColor(Color.WHITE);

                    realAnswer();
                    allquestions.get(correctQuestionPosition).setUserselectedanswer(selectedOptionByUser);
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    playSound();
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_red10);
                    option3.setTextColor(Color.WHITE);

                    realAnswer();
                    allquestions.get(correctQuestionPosition).setUserselectedanswer(selectedOptionByUser);

                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    playSound();
                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_red10);
                    option4.setTextColor(Color.WHITE);

                    realAnswer();
                    allquestions.get(correctQuestionPosition).setUserselectedanswer(selectedOptionByUser);
                }

            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    playSound();
                    if(toast!=null){
                        toast.cancel();
                    }else {
                      toast=  Toast.makeText(QuizActivity.this, "Javob tanlanmadi", Toast.LENGTH_SHORT);
                    }
                    toast.show();
                } else {
                    playSound();
                    changeNextQuestion();
                }
            }
        });



        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound();
                finish();
            }
        });
    }





    private void changeNextQuestion() {
        correctQuestionPosition++;
        if ((correctQuestionPosition + 1) == allquestions.size()) {
            nextbtn.setText("Yakunlash");
        }
        if (correctQuestionPosition < allquestions.size()) {
            selectedOptionByUser = "";
            option1.setBackgroundResource(R.drawable.round_back_white_stroce2_10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroce2_10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));


            option3.setBackgroundResource(R.drawable.round_back_white_stroce2_10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroce2_10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((correctQuestionPosition + 1) + "/" + allquestions.size());
            question.setText(allquestions.get(correctQuestionPosition).getQuestion());
            option1.setText(allquestions.get(correctQuestionPosition).getOption1());
            option2.setText(allquestions.get(correctQuestionPosition).getOption2());
            option3.setText(allquestions.get(correctQuestionPosition).getOption3());
            option4.setText(allquestions.get(correctQuestionPosition).getOption4());
        } else {
            Intent intent = new Intent(QuizActivity.this, QuizResult.class);
            intent.putExtra("correct", getCorrectAnsvers());
            intent.putExtra("incorrect", getInCorrectAnsvers());
            startActivity(intent);
            finish();

        }

    }


    private int getCorrectAnsvers() {
        int correctanswer = 0;
        for (int i = 0; i < allquestions.size(); i++) {

            final String getUserSelectedAnswer = allquestions.get(i).getUserselectedanswer();
            final String getanswer = allquestions.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getanswer)) {
                correctanswer++;
            }

        }
        return correctanswer;
    }

    private int getInCorrectAnsvers() {
        int incorrectanswer = 0;
        for (int i = 0; i < allquestions.size(); i++) {

            final String getUserSelectedAnswer = allquestions.get(i).getUserselectedanswer();
            final String getanswer = allquestions.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getanswer)) {
                incorrectanswer++;
            }

        }
        return incorrectanswer;
    }


   /*
       @Override
   public void onBackPressed() {
        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }*/

    private void realAnswer() {
        final String getanswer = allquestions.get(correctQuestionPosition).getAnswer();
        if (option1.getText().toString().equals(getanswer)) {
            option1.setBackgroundResource(R.drawable.grreen10);
            option1.setTextColor(Color.WHITE);
        } else if (option2.getText().toString().equals(getanswer)) {
            option2.setBackgroundResource(R.drawable.grreen10);
            option2.setTextColor(Color.WHITE);
        } else if (option3.getText().toString().equals(getanswer)) {
            option3.setBackgroundResource(R.drawable.grreen10);
            option3.setTextColor(Color.WHITE);
        } else if (option4.getText().toString().equals(getanswer)) {
            option4.setBackgroundResource(R.drawable.grreen10);
            option4.setTextColor(Color.WHITE);
        }

    }

    public void startTime(View view) {
        time = new CountDownTimer(1200000, 1000) {
            @Override
            public void onTick(long l) {
                long hour = (l / 1000) / 3600;
                long minuts = ((l / 1000) % 3600) / 60;
                long second = (l / 1000) % 60;
                String timeformatted = String.format(Locale.getDefault(), "%02d:%02d", minuts, second);
                downTimer.setText(timeformatted);

            }

            @Override
            public void onFinish() {
                downTimer.setText("00:00");
                if(toast!=null){
                    toast.cancel();
                }else {
                    toast= Toast.makeText(QuizActivity.this, "Vaqt tugadi", Toast.LENGTH_SHORT);
                }
                toast.show();
               // Toast.makeText(QuizActivity.this, "Vaqt tugadi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuizActivity.this, QuizResult.class);
                intent.putExtra("correct", getCorrectAnsvers());
                intent.putExtra("incorrect", getInCorrectAnsvers());
                startActivity(intent);

            }
        }.start();
    }

    private void playSound(){
        if (mp != null)
            mp.start();
    }


}

