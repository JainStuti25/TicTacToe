package com.example.stutijain.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    int myActive = 0;
    int[] myGameState = {2,2,2,2,2,2,2,2,2};

    public void imgTapped(View view){
        ImageView myTapped = (ImageView)view;
       // Log.i("Tag is","Image number is"+myTapped.getTag().toString());
        int tappedImgTag = Integer.parseInt(myTapped.getTag().toString());
        if (myGameState[tappedImgTag] == 2) {
            myGameState[tappedImgTag] = myActive;
            if (myActive == 0) {
                myTapped.setImageResource(R.drawable.wrongmark);
                myTapped.animate().rotation(180).setDuration(100);
                myActive = 1;

            } else {
                myTapped.setImageResource(R.drawable.circlepic);
                myTapped.animate().rotation(180).setDuration(100);
                myActive = 0;
            }

        }
    }

    public void playAgain(View view){
       // Log.i("msg","Play Again Tapped");
        for (int i = 0; i<myGameState.length;i++){
            myGameState[i]=2;
        }

        myActive = 0;
        LinearLayout linearLayout = findViewById(R.id.line1);
        for (int i=0; i< linearLayout.getChildCount();i++){
            ((ImageView)linearLayout.getChildAt(i)).setImageResource(android.R.drawable.btn_star_big_on);


        }

        LinearLayout linearLayout2 = findViewById(R.id.line2);
        for (int i=0; i< linearLayout2.getChildCount();i++){
            ((ImageView)linearLayout2.getChildAt(i)).setImageResource(android.R.drawable.btn_star_big_on);


        }

        LinearLayout linearLayout3 = findViewById(R.id.line3);
        for (int i=0; i< linearLayout3.getChildCount();i++){
            ((ImageView)linearLayout3.getChildAt(i)).setImageResource(android.R.drawable.btn_star_big_on);


        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
