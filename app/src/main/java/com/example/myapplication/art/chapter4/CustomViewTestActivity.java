package com.example.myapplication.art.chapter4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class CustomViewTestActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "jajajasisjfie";

    private Button view;
    private View mButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        measureView();
    }

    private void initView() {
        view = (Button) findViewById(R.id.button1);
        view.setOnClickListener(this);
        mButton2 = (TextView) findViewById(R.id.button2);
    }

    private void measureView() {
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec((1 << 30) - 1, View.MeasureSpec.AT_MOST);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(100, View.MeasureSpec.EXACTLY);
        view.measure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "measureView, width= " + view.getMeasuredWidth() + " height= " + view.getMeasuredHeight());
    }

    @Override
    protected void onStart() {
        super.onStart();
        view.post(new Runnable() {

            @Override
            public void run() {
                int width = view.getMeasuredWidth();
                int height = view.getMeasuredHeight();
                Log.d(TAG, "view.post, width= " + view.getMeasuredWidth() + " height= " + view.getMeasuredHeight());

            }
        });

        ViewTreeObserver observer = view.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            @SuppressWarnings("deprecation")
            @Override
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int width = view.getMeasuredWidth();
                int height = view.getMeasuredHeight();
                Log.d(TAG, "ViewTreeObserver, width= " + view.getMeasuredWidth() + " height= " + view.getMeasuredHeight());

            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            int width = view.getMeasuredWidth();
            int height = view.getMeasuredHeight();
            Log.d(TAG, "onWindowFocusChanged, width= " + view.getMeasuredWidth() + " height= " + view.getMeasuredHeight());
        }
    }

    @Override
    public void onClick(View v) {
        if (v == view) {
            Log.d(TAG, "measure width= " + mButton2.getMeasuredWidth() + " height= " + mButton2.getMeasuredHeight());
            Log.d(TAG, "layout width= " + mButton2.getWidth() + " height= " + mButton2.getHeight());
            Log.d(TAG, "layout width= " + mButton2.getWidth() + " height= " + mButton2.getHeight());
        }
    }
}