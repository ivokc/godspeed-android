package com.example.myapplication.advancelight.chapter10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter10.databinding.DataBindingActivity;
import com.example.myapplication.advancelight.chapter10.simplemvp.ipinfo.IpInfoActivity;

public class Chapter10MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10_main2);
        findViewById(R.id.simple_mvp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, IpInfoActivity.class));
            }
        });

        findViewById(R.id.rxjava_mvp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, com.example.myapplication.advancelight.chapter10.rxjavamvp.ipinfo.IpInfoActivity.class));
            }
        });
        findViewById(R.id.databinding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, DataBindingActivity.class));
            }
        });
    }
}