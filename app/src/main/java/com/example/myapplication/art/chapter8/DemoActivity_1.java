package com.example.myapplication.art.chapter8;

import android.app.Dialog;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class DemoActivity_1 extends AppCompatActivity {
    private static final String TAG = "DemoActivity_1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter8_demo_1);
        initView();

    }

    private void initView() {
        Dialog dialog = new Dialog(this.getApplicationContext());
        TextView textView = new TextView(this);
        textView.setText("this is toast!");
        dialog.setContentView(textView);
        dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        dialog.show();
    }
}