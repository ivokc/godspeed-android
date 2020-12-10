package com.example.myapplication.advancelight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter1.Chapter1MainActivity;

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
    }
}