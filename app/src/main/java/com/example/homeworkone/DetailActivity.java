package com.example.homeworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;


public class DetailActivity extends AppCompatActivity {
    private TextView mResults;
    private TextView mDice1;
    private TextView mDice2;
    private TextView mSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        mResults = findViewById(R.id.tvResults);
        mResults.setText(message);

        int min = 1;
        int max = 6;
        int random1 = new Random().nextInt((max - min) + 1) + min;
        int random2 = new Random().nextInt((max - min) + 1) + min;

        //int sum = random1 + random2;

        Roll roll = new Roll();


//        mDice1 = findViewById(R.id.tvDice1Field);
//        mDice1.setText("" + random1);
//
//        mDice2 = findViewById(R.id.tvDice2Field);
//        mDice2.setText("" + random2);
//
//        mSum = findViewById(R.id.tvSumField);
//        mSum.setText("" + sum);

        roll.setDice1(random1);
        roll.setDice2(random2);
        int sum = (roll.getDice1() + roll.getDice2());
        roll.setSum(sum);

        mDice1 = findViewById(R.id.tvDice1Field);
        mDice2 = findViewById(R.id.tvDice2Field);
        mSum = findViewById(R.id.tvSumField);

        mDice1.setText("" + roll.getDice1());
        mDice2.setText("" + roll.getDice2());
        mSum.setText("" + roll.getSum());

    }
}
