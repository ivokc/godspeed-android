package com.example.myapplication.customview.chapter5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter5.pathmeasure.AlipayActivity;
import com.example.myapplication.customview.chapter5.pathmeasure.GetPosTanActivity;
import com.example.myapplication.customview.chapter5.pathmeasure.GetSegmentDEMOActivity;
import com.example.myapplication.customview.chapter5.svg.SVGAnimActivity;
import com.example.myapplication.customview.chapter5.svg.SVGShowActivity;
import com.example.myapplication.customview.chapter5.svg.SearchEditActivity;

public class Chapter5MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5_main);

        findViewById(R.id.getsegment_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, GetSegmentDEMOActivity.class));
            }
        });

        findViewById(R.id.getpostan_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, GetPosTanActivity.class));
            }
        });

        findViewById(R.id.alipay_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, AlipayActivity.class));
            }
        });
        findViewById(R.id.svg_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, SVGShowActivity.class));
            }
        });

        findViewById(R.id.svg_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, SVGAnimActivity.class));
            }
        });

        findViewById(R.id.search_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter5MainActivity.this, SearchEditActivity.class));
            }
        });
    }
}