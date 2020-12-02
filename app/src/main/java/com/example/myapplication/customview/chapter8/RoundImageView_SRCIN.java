package com.example.myapplication.customview.chapter8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.example.myapplication.R;


/**
 * Created by qijian on 17/2/9.
 */
public class RoundImageView_SRCIN extends View {
    private Paint mBitPaint;
    private Bitmap BmpDST,BmpSRC;

    public RoundImageView_SRCIN(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        mBitPaint = new Paint();
        BmpDST = BitmapFactory.decodeResource(getResources(), R.drawable.dog_shade, null);
        BmpSRC = BitmapFactory.decodeResource(getResources(),R.drawable.dog,null);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth()/2;
        int height = width * BmpDST.getHeight()/BmpDST.getWidth();

        canvas.save();

        canvas.drawBitmap(BmpDST,null,new RectF(0,0,width,height),mBitPaint);
        mBitPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(BmpSRC,null,new RectF(0,0,width,height),mBitPaint);

        mBitPaint.setXfermode(null);
        canvas.restore();
    }
}
