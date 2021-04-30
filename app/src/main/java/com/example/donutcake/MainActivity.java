package com.example.donutcake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv ;
    private CakeAdapter cakeAdapter;
    private ArrayList<Cake> cakes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcv);
        cakes = new ArrayList<>();

        cakes.add(new Cake(R.drawable.donut_yellow_1,"Tasty Donut","Spciy tasty donut family","$10.00"));
        cakes.add(new Cake(R.drawable.donut_red_1,"Pink Donut","Spciy tasty donut family","20.00"));
        cakes.add(new Cake(R.drawable.green_donut_1,"Green Donut","Spciy tasty donut family","$30.00"));
        cakes.add(new Cake(R.drawable.tasty_donut_1,"Tasty Donut","Spciy tasty donut family","$50.00"));

        cakeAdapter = new CakeAdapter(this,cakes);
        rcv.setAdapter(cakeAdapter);

        rcv.setLayoutManager(new GridLayoutManager(this,1));
    }
}