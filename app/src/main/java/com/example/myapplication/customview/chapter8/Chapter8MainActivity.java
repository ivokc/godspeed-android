package com.example.myapplication.customview.chapter8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Chapter8MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter8_main2);


        findViewById(R.id.btn_eraser_view).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, EraserImageActivity.class));
            }
        });

        findViewById(R.id.btn_inverted_img_view).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, InvertImageActivity.class));
            }
        });


        findViewById(R.id.btn_irregular_wave_view).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, IrregularWaveActivity.class));
            }
        });

        findViewById(R.id.btn_lightbook).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, LightBookActivity.class));
            }
        });

        findViewById(R.id.btn_porterduffxfermode).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, PorterDuffXfermodeActivity.class));
            }
        });

        findViewById(R.id.btn_round_img_view).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, RoundImageActivity.class));
            }
        });

        findViewById(R.id.btn_text_wave_view).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, TextWaveActivity.class));
            }
        });

        findViewById(R.id.btn_twitterview).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter8MainActivity.this, TwitterActivity.class));
            }
        });
    }
}