package com.example.android.livescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;
    // Tracks the score for Team B
    int scoreTeamB = 0;
    // Tracks the score for Team A
    int possessionTeamA = 50;
    // Tracks the score for Team B
    int possessionTeamB = 50;
    // Tracks the score for Team A
    int redTeamA = 0;
    // Tracks the score for Team B
    int redTeamB = 0;
    // Tracks the score for Team A
    int yellowTeamA = 0;
    // Tracks the score for Team B
    int yellowTeamB = 0;
    // Tracks the score for Team B
    int foulTeamA = 0;
    // Tracks the score for Team B
    int foulTeamB = 0;
    // Tracks the score for Team B
    int offsideTeamA = 0;
    // Tracks the score for Team B
    int offsideTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the possession for Team A by 5 point.
     */
    public void addPossessionForTeamA(View v) {
        possessionTeamA = possessionTeamA + 5;
        possessionTeamB = possessionTeamB - 5;
        displayPossessionForTeamA(possessionTeamA);
        displayPossessionForTeamB(possessionTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayPossessionForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_possession);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the possession for Team A by 5 point.
     */
    public void addPossessionForTeamB(View v) {
        possessionTeamB = possessionTeamB + 5;
        possessionTeamA = possessionTeamA - 5;
        displayPossessionForTeamB(possessionTeamB);
        displayPossessionForTeamA(possessionTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayPossessionForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_possession);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addRedForTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addRedForTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addYellowForTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addYellowForTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOffsideForTeamA(View v) {
        offsideTeamA = offsideTeamA + 1;
        displayOffsideForTeamA(offsideTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayOffsideForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_offside);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOffsideForTeamB(View v) {
        offsideTeamB = offsideTeamB + 1;
        displayOffsideForTeamB(offsideTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayOffsideForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_offside);
        scoreView.setText(String.valueOf(score));
    }

    public void resetForAllTeams(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        possessionTeamA = 50;
        possessionTeamB = 50;
        redTeamA = 0;
        redTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        offsideTeamA = 0;
        offsideTeamB = 0;

        displayGoalForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayPossessionForTeamA(possessionTeamA);
        displayPossessionForTeamB(possessionTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayOffsideForTeamA(offsideTeamA);
        displayOffsideForTeamB(offsideTeamB);
    }

}
