package com.example.myapplication.customview.chapter3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.customview.chapter3.Animatorset.AnimatorListenerActivity;
import com.example.myapplication.customview.chapter3.Animatorset.PathMenuActivity;
import com.example.myapplication.customview.chapter3.Animatorset.playSequentiallyActivity;
import com.example.myapplication.customview.chapter3.objectanimator.FallingBallActivity;
import com.example.myapplication.customview.chapter3.objectanimator.SetterAnimActivity;
import com.example.myapplication.customview.chapter3.valueanimator.LoadingDemoActivity;
import com.example.myapplication.customview.chapter3.valueanimator.RepeatActivity;
import com.example.myapplication.customview.chapter3.valueanimator.TranslateAnimationActivity;
import com.example.myapplication.customview.chapter3.valueanimator.ValueAnimDemoActivity;

public class Chapter3MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3_main);


        findViewById(R.id.animator_set_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, playSequentiallyActivity.class));
            }
        });

        findViewById(R.id.animator_listener_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, AnimatorListenerActivity.class));
            }
        });

        findViewById(R.id.path_menu_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, PathMenuActivity.class));
            }
        });

        Button btn = (Button)findViewById(R.id.translate_anim);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, TranslateAnimationActivity.class));
            }
        });

        findViewById(R.id.value_anim_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, ValueAnimDemoActivity.class));
            }
        });
        findViewById(R.id.value_repeat).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, RepeatActivity.class));
            }
        });

        findViewById(R.id.loading_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, LoadingDemoActivity.class));
            }
        });
        findViewById(R.id.setter_anim).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, SetterAnimActivity.class));
            }
        });

        findViewById(R.id.falling_ball).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Chapter3MainActivity.this, FallingBallActivity.class));
            }
        });
    }
}