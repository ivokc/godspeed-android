package com.example.myapplication.customview.chapter4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter4.keyframe.RingBellActivity;
import com.example.myapplication.customview.chapter4.keyframe.ofIntFloatActivity;
import com.example.myapplication.customview.chapter4.keyframe.ofObjectActivity;
import com.example.myapplication.customview.chapter4.viewgroupanim.AnimateLayoutChangesActivity;

public class Chapter4MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter4_main);

        findViewById(R.id.of_int_float_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter4MainActivity.this, ofIntFloatActivity.class));
            }
        });

        findViewById(R.id.of_object_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter4MainActivity.this, ofObjectActivity.class));
            }
        });

        findViewById(R.id.ring_bell_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter4MainActivity.this, RingBellActivity.class));
            }
        });
        findViewById(R.id.animateLayoutChangesActivity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter4MainActivity.this, AnimateLayoutChangesActivity.class));
            }
        });
    }
}