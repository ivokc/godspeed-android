package com.example.myapplication.customview.chapter7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter7.bezier.AnimWaveActivity;
import com.example.myapplication.customview.chapter7.bezier.BezierGestureTrackActivity;
import com.example.myapplication.customview.chapter7.bezier.BezierWaveActivity;
import com.example.myapplication.customview.chapter7.bezier.NormalGestureTrackActivity;
import com.example.myapplication.customview.chapter7.bitmapshader.AvatorActivity;
import com.example.myapplication.customview.chapter7.bitmapshader.BitmapShaderActivity;
import com.example.myapplication.customview.chapter7.bitmapshader.TelescopeActivity;
import com.example.myapplication.customview.chapter7.shadowlayer.BitmapShadowActivity;
import com.example.myapplication.customview.chapter7.shadowlayer.ShadowLayerActivity;
import com.example.myapplication.customview.chapter7.shadowlayer.TextShadowActivity;

public class Chapter7MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter7_main2);
        findViewById(R.id.bezier_wave).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, BezierWaveActivity.class));
            }
        });

        findViewById(R.id.normal_gesture_track).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, NormalGestureTrackActivity.class));
            }
        });


        findViewById(R.id.bezier_gesture_track).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, BezierGestureTrackActivity.class));
            }
        });

        findViewById(R.id.anim_wave_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, AnimWaveActivity.class));
            }
        });
        findViewById(R.id.set_shadow_layer_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, ShadowLayerActivity.class));
            }
        });

        findViewById(R.id.text_shadow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, TextShadowActivity.class));
            }
        });

        findViewById(R.id.bitmap_shadow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, BitmapShadowActivity.class));
            }
        });
        findViewById(R.id.bitmap_shader_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, BitmapShaderActivity.class));
            }
        });

        findViewById(R.id.telescope_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, TelescopeActivity.class));
            }
        });

        findViewById(R.id.avator_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter7MainActivity.this, AvatorActivity.class));
            }
        });
    }
}