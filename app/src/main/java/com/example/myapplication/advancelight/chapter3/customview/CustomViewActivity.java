package com.example.myapplication.advancelight.chapter3.customview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class CustomViewActivity extends AppCompatActivity {


    private InvalidTextView iv_text;
    private  RectView rv_rect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_main2);
        iv_text= (InvalidTextView) this.findViewById(R.id.iv_text);
        rv_rect= (RectView) this.findViewById(R.id.rv_rect);
        iv_text.setText("皇家马德里 C罗");
    }
}