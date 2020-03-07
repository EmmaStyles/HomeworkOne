package com.example.homeworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class DetailActivity extends AppCompatActivity {
    private TextView mDice1Field;
    private TextView mDice2Field;
    private TextView mSumField;

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i(TAG,"onCreate Called");


        mDice1Field = findViewById(R.id.tvDice1Field);
        mDice2Field = findViewById(R.id.tvDice2Field);
        mSumField = findViewById(R.id.tvSumField);


        //Intent intent = getIntent();

        int min = 1;
        int max = 6;
        int random1 = new Random().nextInt((max - min) + 1) + min;
        int random2 = new Random().nextInt((max - min) + 1) + min;

        Roll roll = new Roll();
        roll.setDice1(random1);
        roll.setDice2(random2);
        roll.setSum(roll.getDice1(), roll.getDice2());

        mDice1Field.setText(roll.getDice1());
        mDice2Field.setText(roll.getDice2());
        mSumField.setText(roll.getSum());


    }
}
