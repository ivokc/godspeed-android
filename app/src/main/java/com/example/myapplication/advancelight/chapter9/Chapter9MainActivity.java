package com.example.myapplication.advancelight.chapter9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter9.annotation.AnnotationActivity;
import com.example.myapplication.advancelight.chapter9.dagger2.Dagger2Activity;

public class Chapter9MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter9_main2);
        findViewById(R.id.annotation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter9MainActivity.this, AnnotationActivity.class));
            }
        });
        findViewById(R.id.dagger2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter9MainActivity.this, Dagger2Activity.class));
            }
        });
    }
}