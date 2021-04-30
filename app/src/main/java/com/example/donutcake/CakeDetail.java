package com.example.donutcake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CakeDetail extends AppCompatActivity {
    private TextView tvTitle,tvPrice,tvDes;
    private ImageView imgDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donut_detail);
        Intent intent = getIntent();
        int img = intent.getIntExtra("img",0);
        String title = intent.getStringExtra("title");
        String des = intent.getStringExtra("des");
        String price = intent.getStringExtra("price");
        imgDetail = findViewById(R.id.imgddonut);
        imgDetail.setImageResource(img);
        tvTitle = findViewById(R.id.title1);
        tvTitle.setText(title);

        tvDes = findViewById(R.id.description1);
        tvDes.setText(des);

        tvPrice = findViewById(R.id.price1);
        tvPrice.setText(price);
    }
}