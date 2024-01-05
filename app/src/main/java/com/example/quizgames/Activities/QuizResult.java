package com.example.quizgames.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quizgames.MainActivity;
import com.example.quizgames.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class QuizResult extends  AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        final AppCompatButton startNewBtn=findViewById(R.id.startnewquiz);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.yy);
        final int getcorrectanswer=getIntent().getIntExtra("correct",0);
        final int getincorrectanswer=getIntent().getIntExtra("incorrect",0);

        PieChart pieChart=findViewById(R.id.chart);
        ArrayList<PieEntry> entries=new ArrayList<>();
        entries.add(new PieEntry(getcorrectanswer,"To'g'ri javoblar"));
        entries.add(new PieEntry(getincorrectanswer,"Notog'ri javoblar "));



        PieDataSet pieDataSet=new PieDataSet(entries,"Natijalar");
        pieDataSet.setColors(color.MATERIAL_COLORS);

        PieData pieData=new PieData(pieDataSet);
        pieChart.getDescription().setEnabled(false);
        pieChart.animateY(1000);
        pieChart.setData(pieData);
        pieChart.invalidate();

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.start();
              //  startActivity(new Intent(QuizResult.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
       // startActivity(new Intent(QuizResult.this, MainActivity.class));
        finish();
    }

}