package com.example.myapplication.art.chapter5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.R;

public class DemoActivity_1 extends Activity {
    private static final String TAG = "DemoActivity_1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remoteview_demo_1);
        initView();
    }

    private void initView() {
        Toast.makeText(this, getIntent().getStringExtra("sid"),
                Toast.LENGTH_SHORT).show();
    }
}
