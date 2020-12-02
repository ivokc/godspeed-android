package com.example.myapplication.customview.chapter5.svg;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import com.example.myapplication.R;

/**
 * Created by qijian on 17/1/5.
 */
public class SVGAnimActivity extends AppCompatActivity {
//    static {
//        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svg_anim_activity);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.anim_img);
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                        SVGAnimActivity.this, R.drawable.line_animated_vector
                );
                imageView.setImageDrawable(animatedVectorDrawableCompat);
                ((Animatable) imageView.getDrawable()).start();
            }
        });
    }
}
