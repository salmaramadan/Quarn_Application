package com.example.quranapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button go_to_sebha;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);
//        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2500);
//        animationDrawable.setExitFadeDuration(5000);
//        animationDrawable.start();
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        go_to_sebha = findViewById(R.id.go_to_sebha);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Activity1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity4();
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity6();
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity7();
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity8();
            }
        });
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                Activity9();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity10();
            }
        });

        go_to_sebha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sebha();
            }
        });
    }
    public void Activity1() {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }
    public void Activity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void Activity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void Activity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
    public void Activity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
    public void Activity6() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }
    public void Activity7() {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }
    public void Activity8() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }
    public void Activity9() {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }
    public void  Activity10(){
        Intent intent = new Intent(this,Activity10.class);
        startActivity(intent);
    }
    public void  Sebha(){
        Intent intent = new Intent(MainActivity.this, Sebha.class);
        startActivity(intent);
    }
    }
