package com.example.myapplication.customview.chapter3.objectanimator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by qijian on 16/12/7.
 */
public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setScaleSize(float num){
        setScaleX(num);
    }

    public float getScaleSize(){
        return 0.5f;
    }
}
