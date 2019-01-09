package com.example.dell.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView image_dice;
    Random rmd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_dice = findViewById(R.id.iv_dice);
        image_dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice();
            }
        });
    }

    private  void  rolldice(){

        int randomnumber = rmd.nextInt(6)+1;

        switch (randomnumber){

            case 1:
                image_dice.setImageResource(R.drawable.dice1);
                break;

            case 2:
                image_dice.setImageResource(R.drawable.dice2);

                break;

            case 3:
                image_dice.setImageResource(R.drawable.dice3);

                break;

            case 4:
                image_dice.setImageResource(R.drawable.dice4);

                break;

            case 5:
                image_dice.setImageResource(R.drawable.dice5);

                break;
            case 6:
                image_dice.setImageResource(R.drawable.dice6);

                break;

        }

    }
}
