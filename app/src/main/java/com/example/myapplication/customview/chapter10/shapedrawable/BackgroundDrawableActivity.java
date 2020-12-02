package com.example.myapplication.customview.chapter10.shapedrawable;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

/**
 * Created by qijian on 16/9/19.
 */
public class BackgroundDrawableActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_drawable_activity);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.avator);
        CustomDrawable drawable = new CustomDrawable(bitmap);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setBackground(drawable);
    }
}
