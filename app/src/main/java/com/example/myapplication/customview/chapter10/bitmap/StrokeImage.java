package com.example.myapplication.customview.chapter10.bitmap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by qijian on 16/9/30.
 */
@SuppressLint("AppCompatCustomView")
public class StrokeImage extends ImageView {
    public StrokeImage(Context context) {
        super(context);
    }

    public StrokeImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StrokeImage(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Paint p = new Paint();
        p.setColor(Color.CYAN);
        setStateDrawable(this, p);
    }

    /**
     * 主要函数：为bitmap做光晕效果 * @param v * @param p
     */
    private void setStateDrawable(ImageView v, Paint paint) {
        //拿到源图像
        BitmapDrawable bd = (BitmapDrawable) v.getDrawable();
        Bitmap srcBmp = bd.getBitmap();

        Bitmap bitmap = Bitmap.createBitmap(srcBmp.getWidth(), srcBmp.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(srcBmp.extractAlpha(), 0, 0, paint);

        //添加state
        StateListDrawable sld = new StateListDrawable();
        sld.addState(new int[]{android.R.attr.state_pressed}, new BitmapDrawable(getResources(),bitmap));

        //setBackgroundDrawable函数,会移除原有的padding值,如果需要padding,则需调用setPadding
        v.setBackground(sld);
    }


}
