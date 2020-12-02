package com.example.myapplication.customview.chapter7.shadowlayer;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

/**
 * Created by qijian on 17/1/18.
 */
public class TextShadowActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_shadow_activity);

        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setShadowLayer(2,5,5, Color.GRAY);
    }
}
