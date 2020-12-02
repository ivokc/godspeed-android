package com.example.myapplication.customview.chapter9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.myapplication.R;

/**
 * Created by harvic on 2017/5/20.
 */
public class SaveLayerUseExample_3_1 extends View {
    private Paint mPaint;
    private Bitmap mBitmap;

    public SaveLayerUseExample_3_1(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dog);

    }

    @Override
protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawBitmap(mBitmap, 0, 0, mPaint);

    int layerID = canvas.saveLayerAlpha(0, 0, 200, 200, 111, Canvas.ALL_SAVE_FLAG);
    canvas.drawColor(Color.WHITE);
//    canvas.restoreToCount(layerID);
}
}