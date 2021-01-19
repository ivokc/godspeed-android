package com.example.myapplication.advancelight.chapter9.annotation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bosc.shanghang.e.annotations.cls.BindView;
import com.example.myapplication.R;

public class AnnotationActivity extends AppCompatActivity {
    @BindView(value = R.id.tv_text)
    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);
    }
}