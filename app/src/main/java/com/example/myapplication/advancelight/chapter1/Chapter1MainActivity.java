package com.example.myapplication.advancelight.chapter1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter1.cardview.CardViewActivity;
import com.example.myapplication.advancelight.chapter1.notification.MyNotificationActivity;
import com.example.myapplication.advancelight.chapter1.permissions.NativePermissionActivity;
import com.example.myapplication.advancelight.chapter1.recycleview.RecycleViewActivity;
import com.example.myapplication.advancelight.chapter1.toolbar.ToolbarActivity;

public class Chapter1MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1_main2);

       findViewById(R.id.recycle_view).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(Chapter1MainActivity.this, RecycleViewActivity.class));
           }
       });
        findViewById(R.id.card_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, CardViewActivity.class));
            }
        });
        findViewById(R.id.three_type_notfication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, MyNotificationActivity.class));
            }
        });

        findViewById(R.id.tool_bar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, ToolbarActivity.class));
            }
        });
        findViewById(R.id.native_permission).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, NativePermissionActivity.class));
            }
        });



    }
}