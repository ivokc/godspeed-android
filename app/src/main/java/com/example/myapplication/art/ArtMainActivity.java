package com.example.myapplication.art;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.art.chapter2.BinderPoolActivity;
import com.example.myapplication.art.chapter2.BookManagerActivity;
import com.example.myapplication.art.chapter2.MessengerActivity;
import com.example.myapplication.art.chapter2.TCPClientActivity;
import com.example.myapplication.art.chapter3.DemoActivity_1;
import com.example.myapplication.art.chapter3.DemoActivity_2;
import com.example.myapplication.art.chapter3.TestActivity;
import com.example.myapplication.art.chapter4.CustomViewDemoActivity_1;
import com.example.myapplication.art.chapter4.CustomViewDemoActivity_2;
import com.example.myapplication.art.chapter4.CustomViewTestActivity;
import com.example.myapplication.art.chapter5.RemoteViewMainActivity;
import com.example.myapplication.art.chapter6.Chapter6MainActivity;
import com.example.myapplication.art.chapter7.Chapter7MainActivity;
import com.example.myapplication.art.chapter8.Chapter8MainActivity;
import com.example.myapplication.contentprovider.ProviderActivity;

public class ArtMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_main);
        findViewById(R.id.btn_messenger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, MessengerActivity.class));
            }
        });

        findViewById(R.id.btn_book).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, BookManagerActivity.class));
            }
        });
        findViewById(R.id.btn_provider).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, ProviderActivity.class));
            }
        });
        findViewById(R.id.btn_socket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, TCPClientActivity.class));
            }
        });
        findViewById(R.id.btn_binder_pool).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, BinderPoolActivity.class));
            }
        });
        findViewById(R.id.btn_uievent_demo1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, DemoActivity_1.class));
            }
        });
        findViewById(R.id.btn_uievent_demo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, DemoActivity_2.class));
            }
        });
        findViewById(R.id.btn_uievent_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, TestActivity.class));
            }
        });
        findViewById(R.id.btn_art_customview_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, CustomViewTestActivity.class));
            }
        });
        findViewById(R.id.btn_art_customview_demo1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, CustomViewDemoActivity_1.class));
            }
        });
        findViewById(R.id.btn_art_customview_demo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, CustomViewDemoActivity_2.class));
            }
        });
        findViewById(R.id.btn_art_remoteview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, RemoteViewMainActivity.class));
            }
        });

        findViewById(R.id.btn_art_chapter6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter6MainActivity.class));
            }
        });

        findViewById(R.id.btn_art_chapter7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter7MainActivity.class));
            }
        });
        findViewById(R.id.btn_art_chapter8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArtMainActivity.this, Chapter8MainActivity.class));
            }
        });
    }
}