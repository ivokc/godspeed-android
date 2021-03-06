package com.example.myapplication.customview.chapter10.bitmap;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by qijian on 16/9/25.
 * <p/>
 * 两点注意:
 * 1\在AndroidManifest中添加网络使用权限
 * 2\请求网络,必须在子线程中,不能在主线程中,不然直接报错
 */
public class decodeStreamActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decode_stream_activity);

        final ImageView iv = (ImageView) findViewById(R.id.img);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream inputStream = getImage("http://img.my.csdn.net/uploads/201609/24/1474722458_2880.png");
                    final Bitmap bitMap = BitmapFactory.decodeStream(inputStream);

                    iv.post(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageBitmap(bitMap);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

    public static InputStream getImage(String path) throws Exception {
        URL url = new URL(path);
        HttpURLConnection httpURLconnection = (HttpURLConnection) url.openConnection();
        httpURLconnection.setRequestMethod("GET");
        httpURLconnection.setReadTimeout(6 * 1000);
        if (httpURLconnection.getResponseCode() == 200) {
            return httpURLconnection.getInputStream();

        }
        return null;
    }

}
