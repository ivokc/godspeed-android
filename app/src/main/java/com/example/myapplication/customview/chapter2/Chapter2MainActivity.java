package com.example.myapplication.customview.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter2.animdemo.CameraStretchDemo;
import com.example.myapplication.customview.chapter2.animdemo.LoadingDemo;
import com.example.myapplication.customview.chapter2.animdemo.ScannerDemo;
import com.example.myapplication.customview.chapter2.frameanim.FrameAnimJAVAActivity;
import com.example.myapplication.customview.chapter2.frameanim.FrameAnimXMLActivity;
import com.example.myapplication.customview.chapter2.viewanimation.AnimationJAVAActivity;
import com.example.myapplication.customview.chapter2.viewanimation.AnimationXMLActivity;

public class Chapter2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2_main);

        findViewById(R.id.anim_xml_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, AnimationXMLActivity.class));
            }
        });

        findViewById(R.id.anim_java_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, AnimationJAVAActivity.class));
            }
        });
        findViewById(R.id.camera_stretch_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, CameraStretchDemo.class));
            }
        });

        findViewById(R.id.loading_demo_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, LoadingDemo.class));
            }
        });

        findViewById(R.id.scanner_demo_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, ScannerDemo.class));
            }
        });
        findViewById(R.id.xml_create).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, FrameAnimXMLActivity.class));
            }
        });

        findViewById(R.id.java_create).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter2MainActivity.this, FrameAnimJAVAActivity.class));
            }
        });
    }
}