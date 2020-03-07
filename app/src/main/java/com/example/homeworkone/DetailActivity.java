package com.example.homeworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.random;

import java.text.NumberFormat;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    private TextView mResults;
    private TextView mDice1;
    private TextView mDice1Field;
    private TextView mDice2;
    private TextView mDice2Field;
    private TextView mSum;
    private TextView mSumField;

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mResults = findViewById(R.id.tvResults);
        mDice1 = findViewById(R.id.tvDice1);
        mDice1Field = findViewById(R.id.tvDice1Field);
        mDice2 = findViewById(R.id.tvDice2);
        mDice2Field = findViewById(R.id.tvDice2Field);
        mSum = findViewById(R.id.tvSum);
        mSumField = findViewById(R.id.tvSumField);


        Intent intent = getIntent();

        int min = 1;
        int max = 6;
        int random1 = new Random().nextInt((max - min) + 1) + min;
        int random2 = new Random().nextInt((max - min) + 1) + min;


        //String coinSymbol = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Log.i(TAG, "Coin-Symbol = " + coinSymbol);
        //NumberFormat formatter = NumberFormat.getCurrencyInstance();

        //ArrayList<Coin> coins = Coin.getCoins();

        final Roll roll = Roll.searchRoll(coinSymbol);

        mName.setText(coin.getName());
        mSymbol.setText(coin.getSymbol());
        mValue.setText(formatter.format(coin.getValue()));
        mChange1h.setText((coin.getChange1h()) + "%");
        mChange24h.setText((coin.getChange24h()) + "%");
        mChange7d.setText((coin.getChange7d()) + "%");
        mMarketcap.setText(formatter.format(coin.getMarketcap()));
        mVolume.setText(formatter.format(coin.getVolume()));
        mSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                searchCoin(coin.getName());
            }
        });

//        for (final Coin coin : coins) {
//            if(coin.getSymbol().equals(coinSymbol)) {
//                setTitle(coin.getName());
//                mName.setText(coin.getName());
//                mSymbol.setText(coin.getSymbol());
//                mValue.setText(formatter.format(coin.getValue()));
//                mChange1h.setText((coin.getChange1h()) + "%");
//                mChange24h.setText((coin.getChange24h()) + "%");
//                mChange7d.setText((coin.getChange7d()) + "%");
//                mMarketcap.setText(formatter.format(coin.getMarketcap()));
//                mVolume.setText(formatter.format(coin.getVolume()));
//                mSearch.setOnClickListener(new View.OnClickListener(){
//                    @Override
//                    public void onClick(View v) {
//                        searchCoin(coin.getName());
//                    }
//                });
//                }
//            }
//        }


//        mDetailMessage = findViewById(R.id.tvdetailMessage);
//        mDetailMessage.setText(message);

//       mShowVideoButton = findViewById(R.id.btnShowVideo);
//        mShowVideoButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showVideo("https://www.youtube.com/watch?v=-iIbc-h9ijc");
    }
//        });
//    }

    private void showVideo(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}
