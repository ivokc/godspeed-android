package com.example.myapplication.customview.chapter10.bitmap;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;

/**
 * Created by qijian on 16/9/27.
 * 7.5.4.1 创建白色透明渐变图像
 */
public class ExtraAlphaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.extra_alpha_activity);

        //基本提取Alpha图像
        baseExtraAlpha();

        //发光效果
        adVanceExtraAlpha();


    }

    //基本提取Alpha图像
    private void baseExtraAlpha() {
        Bitmap srcBmp = BitmapFactory.decodeResource(getResources(), R.drawable.cat_dog);

        Bitmap bitmap = Bitmap.createBitmap(srcBmp.getWidth(), srcBmp.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(Color.CYAN);
        canvas.drawBitmap(srcBmp.extractAlpha(), 0, 0, paint);

        ImageView iv = (ImageView) findViewById(R.id.img);
        iv.setImageBitmap(bitmap);

        srcBmp.recycle();
    }

    //发光效果
    private void adVanceExtraAlpha() {
        Bitmap srcBmp = BitmapFactory.decodeResource(getResources(), R.drawable.cat_dog);
        //获取Alpha bitmap
        Paint alphaPaint = new Paint();
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(20, BlurMaskFilter.Blur.NORMAL);
        alphaPaint.setMaskFilter(blurMaskFilter);
        int[] offsetXY = new int[2];
        Bitmap alphaBmp = srcBmp.extractAlpha(alphaPaint, offsetXY);
        //创建Bitmap
        Bitmap bitmap = Bitmap.createBitmap(alphaBmp.getWidth(), alphaBmp.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(Color.CYAN);
        canvas.drawBitmap(alphaBmp, 0, 0, paint);
        //绘制源图像
        canvas.drawBitmap(srcBmp, -offsetXY[0], -offsetXY[1], null);
        //设置图像并回收没用的图像资源
        ImageView iv = (ImageView) findViewById(R.id.img2);
        iv.setImageBitmap(bitmap);
        srcBmp.recycle();
    }
}
