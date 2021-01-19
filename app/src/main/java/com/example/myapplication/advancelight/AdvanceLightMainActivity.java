package com.example.myapplication.advancelight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter1.Chapter1MainActivity;
import com.example.myapplication.advancelight.chapter10.Chapter10MainActivity;
import com.example.myapplication.advancelight.chapter2.Chapter2MainActivity;
import com.example.myapplication.advancelight.chapter3.Chapter3MainActivity;
import com.example.myapplication.advancelight.chapter5.Chapter5MainActivity;
import com.example.myapplication.advancelight.chapter7.Chapter7MainActivity;
import com.example.myapplication.advancelight.chapter8.Chapter8MainActivity;
import com.example.myapplication.advancelight.chapter9.Chapter9MainActivity;

public class AdvanceLightMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_light_main);

        findViewById(R.id.btn_chapter1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter1MainActivity.class));
            }
        });

        findViewById(R.id.btn_chapter2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter2MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter3MainActivity.class));
            }
        });

        findViewById(R.id.btn_chapter5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter5MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter7MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter8MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter9MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvanceLightMainActivity.this, Chapter10MainActivity.class));
            }
        });
    }
}