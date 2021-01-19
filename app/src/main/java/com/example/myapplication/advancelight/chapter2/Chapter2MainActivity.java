package com.example.myapplication.advancelight.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter2.coordinatorlayout.CollapsingToolbarActivity;
import com.example.myapplication.advancelight.chapter2.coordinatorlayout.CoordinatorLayoutActivity;
import com.example.myapplication.advancelight.chapter2.designsupportlibrary.SnackbarActivity;
import com.example.myapplication.advancelight.chapter2.navigationview.NavigationViewActivity;
import com.example.myapplication.advancelight.chapter2.tablayout.TabLayoutActivity;

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

        findViewById(R.id.tablayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, TabLayoutActivity.class));
            }
        });
        findViewById(R.id.navigation_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, NavigationViewActivity.class));
            }
        });
        findViewById(R.id.coordinatorlayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, CoordinatorLayoutActivity.class));
            }
        });
        findViewById(R.id.collapsing_toolbar_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, CollapsingToolbarActivity.class));
            }
        });





    }
}