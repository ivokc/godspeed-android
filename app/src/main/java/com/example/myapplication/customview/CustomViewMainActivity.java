package com.example.myapplication.customview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter1.Chapter1MainActivity;
import com.example.myapplication.customview.chapter10.Chapter10MainActivity;
import com.example.myapplication.customview.chapter2.Chapter2MainActivity;
import com.example.myapplication.customview.chapter3.Chapter3MainActivity;
import com.example.myapplication.customview.chapter4.Chapter4MainActivity;
import com.example.myapplication.customview.chapter5.Chapter5MainActivity;
import com.example.myapplication.customview.chapter6.Chapter6MainActivity;
import com.example.myapplication.customview.chapter7.Chapter7MainActivity;
import com.example.myapplication.customview.chapter8.Chapter8MainActivity;
import com.example.myapplication.customview.chapter9.Chapter9MainActivity;

public class CustomViewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_main);
        findViewById(R.id.btn_chapter1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter1MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter2MainActivity.class));
            }
        });

        findViewById(R.id.btn_chapter3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter3MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter4MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter5MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter6MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter7MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter8MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter9MainActivity.class));
            }
        });
        findViewById(R.id.btn_chapter10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomViewMainActivity.this, Chapter10MainActivity.class));
            }
        });





    }
}