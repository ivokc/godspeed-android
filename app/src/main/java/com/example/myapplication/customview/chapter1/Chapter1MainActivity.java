package com.example.myapplication.customview.chapter1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter1.canvasoperation.CircleOperationActivity;
import com.example.myapplication.customview.chapter1.canvasoperation.ClipRgnActivity;
import com.example.myapplication.customview.chapter1.canvasoperation.CustomCircleActivity;
import com.example.myapplication.customview.chapter1.canvasoperation.CustomViewActivity;
import com.example.myapplication.customview.chapter1.paintbasis.PathView_1_2_Activity;
import com.example.myapplication.customview.chapter1.paintbasis.RectPontView_1_1_4_Activity;
import com.example.myapplication.customview.chapter1.paintbasis.SpiderActivity;
import com.example.myapplication.customview.chapter1.paintbasis.Summarize_1_1_1_Activity;
import com.example.myapplication.customview.chapter1.paintbasis.Summarize_1_1_3_Activity;
import com.example.myapplication.customview.chapter1.paintbasis.intersect_1_1_4_Activity;
import com.example.myapplication.customview.chapter1.regionbasis.RegionConstructActivity;
import com.example.myapplication.customview.chapter1.regionbasis.RegionOpActivity;

public class Chapter1MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1_main);
        findViewById(R.id.summarize_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, Summarize_1_1_1_Activity.class));
            }
        });

        findViewById(R.id.canvas_basis_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, Summarize_1_1_3_Activity.class));
            }
        });
        findViewById(R.id.rect_point_view_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, RectPontView_1_1_4_Activity.class));
            }
        });

        findViewById(R.id.intersect_view_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, intersect_1_1_4_Activity.class));
            }
        });

        findViewById(R.id.path_view_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, PathView_1_2_Activity.class));
            }
        });
        findViewById(R.id.spider_view_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, SpiderActivity.class));
            }
        });
        findViewById(R.id.region_construct_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, RegionConstructActivity.class));
            }
        });
        findViewById(R.id.region_op_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, RegionOpActivity.class));
            }
        });
        findViewById(R.id.canvas_operation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, CircleOperationActivity.class));
            }
        });
        findViewById(R.id.canvas_circle_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, CustomCircleActivity.class));
            }
        });

        findViewById(R.id.clip_rgn_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, ClipRgnActivity.class));
            }
        });

        findViewById(R.id.custom_view_xml).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter1MainActivity.this, CustomViewActivity.class));
            }
        });

    }
}