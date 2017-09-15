package com.example.pc.battery_levellist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int count =4;
    ImageView bImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bImg = (ImageView)findViewById(R.id.bImg);
        displayLevel(count);
    }

    public void increment(View v){
        if (count<7){
        count ++;
        displayLevel(count);}
    }

    public void decrement(View v){
        if(count>0){
        count --;
        displayLevel(count);}
    }

    private void displayLevel(int count){
        bImg.setImageLevel(count);
    }
}
