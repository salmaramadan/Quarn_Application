package com.example.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity11 extends AppCompatActivity {
    Button home,other_city;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);
        TextView city;
        imageView = findViewById(R.id.imageView);
        city=findViewById(R.id.city);
        SharedPreferences sd = getSharedPreferences("store",MODE_PRIVATE);
        String City= sd.getString("city","Cairo");
        city.setText(City);
        switch (City){
            case "الاسكندرية":
                imageView.setImageResource(R.drawable.alexandria);
                break;
            case "أسوان":
                imageView.setImageResource(R.drawable.aswan);
                break;
            case "الجيزة":
                imageView.setImageResource(R.drawable.giza);
                break;
            case "القاهرة":
                imageView.setImageResource(R.drawable.cairo);
                break;
            case "المنصورة":
                imageView.setImageResource(R.drawable.mansoura);
                break;
            case "المنوفية":
                imageView.setImageResource(R.drawable.menofia);
                break;
            case "سوهاج":
                imageView.setImageResource(R.drawable.sohag);
                break;
            case "أسيوط":
                imageView.setImageResource(R.drawable.asiut);
                break;
            case "الوادي الجديد":
                imageView.setImageResource(R.drawable.wadigedid);
                break;
            case "الأقصر":
                imageView.setImageResource(R.drawable.luxor);
                break;
        }
        home = findViewById(R.id.back11);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity11.this,MainActivity.class);
                startActivity(intent);
            }
        });

       other_city = findViewById(R.id.back12);
        other_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
