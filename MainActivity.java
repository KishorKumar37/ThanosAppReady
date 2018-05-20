package com.example.dkish.thanosapplicationprototype;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


import java.util.Random;


/**
 * This app displays an order button to obtain a random infinity stone.
 */
public class MainActivity extends AppCompatActivity {

    String[] stones = {"Reality Stone" , "Mind Stone" , "Soul Stone" , "Time Stone" , "Space Stone" , "Power Stone"};
    int S = 0;
    Integer[] numbers = new Integer[6];
    int flag = 0;



    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }

    public void generateStone(View view) {
        Random rand = new Random();
        int value = rand.nextInt(6);
        for(int i=0 ; i<S ; i++) {
            if (numbers[i] == value) {
                flag = 1;
                break;
            }
            else
                flag=0;
            }

        if(flag==0) {
            TextView holds = (TextView) findViewById(R.id.holds);
            holds.append(stones[value]);
            numbers[S++]=value;
        }
        display(value);
    }


    private void display(int number) {
        TextView stoneName = (TextView) findViewById(R.id.stone_name);
        stoneName.setText(stones[number]);
        switch(number) {
            case 0:
                stoneName.setBackgroundColor(Color.rgb(255,0,0));
                break;
            case 1:
                stoneName.setBackgroundColor(Color.rgb(255,255,0));
                break;
            case 2:
                stoneName.setBackgroundColor(Color.rgb(255, 165, 0));
                break;
            case 3:
                stoneName.setBackgroundColor(Color.rgb(0,255,0));
                break;
            case 4:
                stoneName.setBackgroundColor(Color.rgb(0,0,255));
                break;
            case 5:
                stoneName.setBackgroundColor(Color.rgb(75, 0, 130));
                break;
                default: break;
        }


        if(S==6){
            TextView holds = (TextView) findViewById(R.id.holds);
            holds.setText("You have obtained all the stones.Please stop pressing the button");
        }

    }
}
