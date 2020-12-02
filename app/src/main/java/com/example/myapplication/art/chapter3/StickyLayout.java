package com.example.myapplication.art.chapter3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 2020/10/28 12:09 PM
 **/
public class StickyLayout extends LinearLayout {

    private int mTouchSlop;
    //分别记录上次滑动的坐标
    private int mLastX = 0;
    private int mLastY = 0;
    //分别记录上次滑动的坐标
    private int mLastXIntercept = 0;
    private int mLastYIntercept = 0;

    public StickyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }



}
