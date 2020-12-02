package com.example.myapplication.customview.chapter6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Chapter6MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6_main2);

        findViewById(R.id.text_lines).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter6MainActivity.this,MyTextViewActivity.class));
            }
        });

        findViewById(R.id.text_min_rect).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter6MainActivity.this,MinTextRectActivity.class));
            }
        });
    }
}