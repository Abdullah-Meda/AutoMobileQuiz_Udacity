package com.example.android.automobilequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {
        EditText question1EditText = (EditText) findViewById(R.id.q1a);
        String answer1 = question1EditText.getText().toString();

        EditText question2EditText = (EditText) findViewById(R.id.q2a);
        String answer2 = question2EditText.getText().toString();

        CheckBox question3CheckBox1 = (CheckBox) findViewById(R.id.q3a1);
        boolean answer31 = question3CheckBox1.isChecked();

        CheckBox question3CheckBox2 = (CheckBox) findViewById(R.id.q3a2);
        boolean answer32 = question3CheckBox2.isChecked();

        RadioButton question4RadioButton = (RadioButton) findViewById(R.id.q4a2);
        boolean answer4 = question4RadioButton.isChecked();

        RadioButton question5RadioButton = (RadioButton) findViewById(R.id.q5a3);
        boolean answer5 = question5RadioButton.isChecked();

        RadioButton question6RadioButton = (RadioButton) findViewById(R.id.q6a2);
        boolean answer6 = question6RadioButton.isChecked();

        int finalScore = calculateScore(answer1, answer2, answer31, answer32, answer4, answer5, answer6);

        Toast.makeText(this, "Your final score is " + finalScore, Toast.LENGTH_LONG).show();

        finalScore = 0;
        score = 0;
    }

    private int calculateScore(String answer1, String a2, boolean a31, boolean a32, boolean a4, boolean a5, boolean a6) {

        if (answer1.equalsIgnoreCase("FORD MUSTANG")){
            score += 1;
        }

        if (a2.equalsIgnoreCase(getString(R.string.q2ans))){
            score += 1;
        }

        if (a31 && a32){
            score += 1;
        }

        if (a4){
            score += 1;
        }

        if (a5){
            score += 1;
        }

        if (a6){
            score += 1;
        }

        return score;

    }
}