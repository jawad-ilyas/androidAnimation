package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button tran ,  alpha ,  rotate  , scale;
    TextView textAnim;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.alpha);
                textAnim.startAnimation(alpha);
            }
        });

        tran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation move = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.move);
                textAnim.startAnimation(move);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.rotate);
                textAnim.startAnimation(rotate);
            }
        });



        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.scale);
                textAnim.startAnimation(rotate);
            }
        });








    }


    public  void init(){


        tran = findViewById(R.id.translate);
        alpha = findViewById(R.id.alpha);
        rotate = findViewById(R.id.rotate);
        scale = findViewById(R.id.scale);
        textAnim = findViewById(R.id.textAnim);
    }

}