package com.example.myapplication.advancelight.chapter5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter5.okhttp3.Okhttp3Activity;
import com.example.myapplication.advancelight.chapter5.retrofit.RetrofitActivity;
import com.example.myapplication.advancelight.chapter5.urlconnect.UrlConnectActivity;
import com.example.myapplication.advancelight.chapter5.volley.VolleyActivity;

public class Chapter5MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5_main2);


        findViewById(R.id.url_connect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, UrlConnectActivity.class));
            }
        });


        findViewById(R.id.volley).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, VolleyActivity.class));
            }
        });

        findViewById(R.id.okhttp3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, Okhttp3Activity.class));
            }
        });
        findViewById(R.id.retrofit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, RetrofitActivity.class));
            }
        });

    }


}