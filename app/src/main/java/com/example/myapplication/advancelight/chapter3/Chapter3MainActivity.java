package com.example.myapplication.advancelight.chapter3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter3.customgroup.CustomGroupActivity;
import com.example.myapplication.advancelight.chapter3.customview.CustomViewActivity;
import com.example.myapplication.advancelight.chapter3.slide.ViewSlideActivity;
import com.example.myapplication.advancelight.chapter3.customviewgroup.CustomViewGroupActivity;

public class Chapter3MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3_main3);

        findViewById(R.id.slide_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, ViewSlideActivity.class));
            }
        });


        findViewById(R.id.custom_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, CustomViewActivity.class));
            }
        });


        findViewById(R.id.custom_group).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, CustomGroupActivity.class));
            }
        });
        findViewById(R.id.custom_view_group).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, CustomViewGroupActivity.class));
            }
        });
    }
}