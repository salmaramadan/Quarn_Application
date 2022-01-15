package com.example.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sebha extends AppCompatActivity {
    private TextView counterTxt ,TextView2;
    private Button minusBtn , plusBtn ,resetBtn, home;
    private  int counter ;
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.minusbtn:
                    minusCounter();
                    break;

                case R.id.plusbtn:
                    plusCounter();
                    break;

                case  R.id.resetbtn:
                    initCounter();
                    break;
            }


        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sebha);
        home = findViewById(R.id.back13);
        counterTxt =(TextView) findViewById(R.id.counterTxt);
        TextView2 =(TextView) findViewById(R.id.istgfar);
        minusBtn =(Button) findViewById(R.id.minusbtn);
        minusBtn.setOnClickListener(clickListener);
        plusBtn =(Button) findViewById(R.id.plusbtn);
        plusBtn.setOnClickListener(clickListener);
        resetBtn =(Button) findViewById(R.id.resetbtn);
        resetBtn.setOnClickListener(clickListener);

        initCounter();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void initCounter(){
        counter=0;
        counterTxt.setText(counter + "");
    }
    private void plusCounter(){
        counter++;
        counterTxt.setText(counter + "");
    }

    private void minusCounter(){
        counter--;
        counterTxt.setText(counter + "");
    }
}