package com.example.myapplication.advancelight.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter2.designsupportlibrary.SnackbarActivity;

public class Chapter2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2_main3);


        findViewById(R.id.design_support_library).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, SnackbarActivity.class));
            }
        });
    }
}