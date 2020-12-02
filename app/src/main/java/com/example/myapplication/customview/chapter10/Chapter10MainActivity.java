package com.example.myapplication.customview.chapter10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter10.bitmap.BitmapCompressActivity;
import com.example.myapplication.customview.chapter10.bitmap.BitmapDensityActivity;
import com.example.myapplication.customview.chapter10.bitmap.BitmapFactoryOptionsActivity;
import com.example.myapplication.customview.chapter10.bitmap.BitmapPixelActivity;
import com.example.myapplication.customview.chapter10.bitmap.BitmapStaticConstructorActivity;
import com.example.myapplication.customview.chapter10.bitmap.ExtraAlphaActivity;
import com.example.myapplication.customview.chapter10.bitmap.WaterMarkActivity;
import com.example.myapplication.customview.chapter10.bitmap.decodeByteArrayActivity;
import com.example.myapplication.customview.chapter10.bitmap.decodeStreamActivity;
import com.example.myapplication.customview.chapter10.shapedrawable.BackgroundDrawableActivity;
import com.example.myapplication.customview.chapter10.shapedrawable.ImgDrawableActivity;
import com.example.myapplication.customview.chapter10.shapedrawable.ShaderDemoActivity;
import com.example.myapplication.customview.chapter10.shapedrawable.ShapeConstructorActivity;
import com.example.myapplication.customview.chapter10.shapedrawable.ShapeInstanceActivity;
import com.example.myapplication.customview.chapter10.shapedrawable.TelescopeActivity;

public class Chapter10MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10_main);

        findViewById(R.id.btn_shape_instance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, ShapeInstanceActivity.class));
            }
        });
        findViewById(R.id.btn_shape_construct).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, ShapeConstructorActivity.class));
            }
        });

        findViewById(R.id.btn_shape_shader).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, ShaderDemoActivity.class));
            }
        });
        findViewById(R.id.btn_shape_telescope).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, TelescopeActivity.class));
            }
        });
        findViewById(R.id.btn_custom_drawable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, ImgDrawableActivity.class));
            }
        });

        findViewById(R.id.btn_background_drawable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, BackgroundDrawableActivity.class));
            }
        });

        findViewById(R.id.decode_byte_array_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, decodeByteArrayActivity.class));
            }
        });

        findViewById(R.id.decode_stream_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, decodeStreamActivity.class));
            }
        });

        findViewById(R.id.bitmap_factory_option_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, BitmapFactoryOptionsActivity.class));
            }
        });

        findViewById(R.id.bitmap_static_constructor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, BitmapStaticConstructorActivity.class));
            }
        });

        findViewById(R.id.bitmap_extract_alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, ExtraAlphaActivity.class));
            }
        });

        findViewById(R.id.bitmap_density).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, BitmapDensityActivity.class));
            }
        });

        findViewById(R.id.bitmap_pixel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, BitmapPixelActivity.class));
            }
        });

        findViewById(R.id.bitmap_compress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, BitmapCompressActivity.class));
            }
        });

        findViewById(R.id.bitmap_watermark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chapter10MainActivity.this, WaterMarkActivity.class));
            }
        });

    }
}