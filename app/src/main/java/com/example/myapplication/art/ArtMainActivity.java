package com.example.myapplication.art;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.art.chapter2.Chapter2MainActivity;
import com.example.myapplication.art.chapter3.Chapter3MainActivity;
import com.example.myapplication.art.chapter4.Chapter4MainActivity;
import com.example.myapplication.art.chapter6.Chapter6MainActivity;
import com.example.myapplication.art.chapter7.Chapter7MainActivity;
import com.example.myapplication.art.chapter8.Chapter8MainActivity;

public class ArtMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_main);

        findViewById(R.id.btn_art_chapter2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter2MainActivity.class));
            }
        });

        findViewById(R.id.btn_art_chapter3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter3MainActivity.class));
            }
        });
        findViewById(R.id.btn_art_chapter4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter4MainActivity.class));
            }
        });
        findViewById(R.id.btn_art_chapter6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter6MainActivity.class));
            }
        });

        findViewById(R.id.btn_art_chapter7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter7MainActivity.class));
            }
        });
        findViewById(R.id.btn_art_chapter8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter8MainActivity.class));
            }
        });
    }
}