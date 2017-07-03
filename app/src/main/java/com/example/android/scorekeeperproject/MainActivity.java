/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.scorekeeperproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the rugby score and cards for 2 teams.
 */
public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks the yellow cards for Team A
    int yellowCardTeamA = 0;

    // Tracks the red cards for Team A
    int redCardTeamA = 0;

    // Tracks the yellow cards for Team B
    int yellowCardTeamB = 0;

    // Tracks the red cards for Team B
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 5 points.
     */
    public void addFiveForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 5 points.
     */
    public void addFiveForTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayRedCardForTeamA(redCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 1 yellow card to Team A
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    /**
     * Displays the number of yellow cards for Team A
     */
    public void displayYellowCardForTeamA(int numberOfCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(numberOfCard));
    }

    /**
     * Add 1 red card to Team A
     */
    public void addRedCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardForTeamA(redCardTeamA);
    }

    /**
     * Displays the number of red cards for Team A
     */
    public void displayRedCardForTeamA(int numberOfCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(numberOfCard));
    }

    /**
     * Add 1 yellow card to Team B
     */
    public void addYellowCardForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the number of yellow cards for Team !b
     */
    public void displayYellowCardForTeamB(int numberOfCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(numberOfCard));
    }

    /**
     * Add 1 red card to Team B
     */
    public void addRedCardForTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the number of red cards for Team B
     */
    public void displayRedCardForTeamB(int numberOfCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(numberOfCard));
    }
}