package com.example.android.courtcounter;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scorekeeperapplol.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int scoreTeamA=0;
    int scoreTeamB=0;

    int scoreTeamABaron;
    int scoreTeamBBaron;

    int scoreTeamADrake;
    int scoreTeamBDrake;

    // Team Score A
    public void addOnePointTeamAVictory(View v){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    // Team Score B
    public void addOnePointTeamBVictory(View v){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    // Baron A Text
    public void addOnePointsTeamABaron(View v){
        scoreTeamABaron = scoreTeamABaron + 1;
        displayForTeamABaronA(scoreTeamABaron);
    }

    // Baron B Text
    public void addOnePointsTeamBBaron(View v){
        scoreTeamBBaron = scoreTeamBBaron + 1;
        displayForTeamBBaronB(scoreTeamBBaron);
    }

    // Drake A Text
    public void addOnePointsTeamADrake(View v){
        scoreTeamADrake = scoreTeamADrake+1;
        displayForTeamADrakeA(scoreTeamADrake);
    }

    // Drake B Text
    public void addOnePointsTeamBDrake(View v){
        scoreTeamBDrake = scoreTeamBDrake+1;
        displayForTeamBDrakeB(scoreTeamBDrake);
    }

    // Reset Scores
    public void ResetScore(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        scoreTeamABaron=0;
        scoreTeamBBaron=0;
        scoreTeamADrake=0;
        scoreTeamBDrake=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamABaronA(scoreTeamABaron);
        displayForTeamBBaronB(scoreTeamBBaron);
        displayForTeamADrakeA(scoreTeamADrake);
        displayForTeamBDrakeB(scoreTeamBDrake);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.txtTeamScoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.txtTeamScoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamABaronA(int score) {
        TextView scoreViewBaronA = (TextView) findViewById(R.id.txtBaronScoreTeamA);
        scoreViewBaronA.setText(String.valueOf(score));
    }

    public void displayForTeamBBaronB(int score) {
        TextView scoreViewBaronB = (TextView) findViewById(R.id.baronScoreTeamB);
        scoreViewBaronB.setText(String.valueOf(score));
    }

    public void displayForTeamADrakeA(int score) {
        TextView scoreViewDrakeA = (TextView) findViewById(R.id.txtDrakeScoreTeamA);
        scoreViewDrakeA.setText(String.valueOf(score));
    }

    public void displayForTeamBDrakeB(int score) {
        TextView scoreViewDrakeB = (TextView) findViewById(R.id.txtDrakeScoreTeamB);
        scoreViewDrakeB.setText(String.valueOf(score));
    }
}