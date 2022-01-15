package com.example.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity10 extends AppCompatActivity {
    RadioGroup radioGroup ;
    RadioButton radioAlex, radioCairo,radioMansoura, radioGiza,radioAswan,radiomenofia,radiosohag,radioasiut,radioelwadielgedid,radioluxor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        radioGroup  = (RadioGroup) findViewById(R.id.radioGroup);
        radioAlex=(RadioButton)findViewById(R.id.radioAlex);
        radioAswan=(RadioButton)findViewById(R.id.radioAswan);
        radioCairo=(RadioButton)findViewById(R.id.radioCairo);
        radioGiza=(RadioButton)findViewById(R.id.radioGiza);
        radioMansoura=(RadioButton)findViewById(R.id.radioMansoura);

        radiomenofia=(RadioButton)findViewById(R.id.menofia);
        radiosohag=(RadioButton)findViewById(R.id.sohag);
        radioasiut=(RadioButton)findViewById(R.id.asiut);
        radioelwadielgedid=(RadioButton)findViewById(R.id.elwadielgedid);
        radioluxor=(RadioButton)findViewById(R.id.luxor);

        radioAlex.setOnClickListener(new Click());
        radioAswan.setOnClickListener(new Click());
        radioCairo.setOnClickListener(new Click());
        radioGiza.setOnClickListener(new Click());
        radioMansoura.setOnClickListener(new Click());

        radiomenofia.setOnClickListener(new Click());
        radiosohag.setOnClickListener(new Click());
        radioasiut.setOnClickListener(new Click());
        radioelwadielgedid.setOnClickListener(new Click());
        radioluxor.setOnClickListener(new Click());




    }
    public class Click implements View.OnClickListener{

        SharedPreferences sd = getSharedPreferences("store",MODE_PRIVATE);
        SharedPreferences.Editor editor=sd.edit();
        Intent i = new Intent(Activity10.this,Activity11.class);


        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.radioAlex:

                    editor.putString("city","الاسكندرية");
                    editor.apply();
                    startActivity(i);


                    break;
                case R.id.radioAswan:

                    editor.putString("city","أسوان");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.radioGiza:
                    editor.putString("city","الجيزة");
                    editor.apply();
                    startActivity(i);

                    break;

                case R.id.radioCairo:
                    editor.putString("city","القاهرة");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.radioMansoura:
                    editor.putString("city","المنصورة");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.menofia:
                    editor.putString("city","المنوفية");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.sohag:
                    editor.putString("city","سوهاج");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.asiut:
                    editor.putString("city","أسيوط");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.elwadielgedid:
                    editor.putString("city","الوادي الجديد");
                    editor.apply();
                    startActivity(i);

                    break;
                case R.id.luxor:
                    editor.putString("city","الأقصر");
                    editor.apply();
                    startActivity(i);

                    break;
            }
        }
    }

}