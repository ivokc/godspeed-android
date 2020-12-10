package com.example.myapplication.art.chapter5;


import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.TextView;

import androidx.core.app.NotificationCompat;

import com.example.myapplication.R;

public class TestActivity extends Activity implements OnClickListener {

    private static final String TAG = "TestActivity";
    private static final String CHANNEL_ID = "test";
    private Button mButton1;
    private View mButton2;

    private TestActivity instance;
    private static int sId = 0;
    NotificationManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remoteview_test);
        initView();
        instance = this;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "测试", importance);
            channel.setDescription("测试渠道");
            manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
            manager.createNotificationChannel(channel);
        }

    }

    private void initView() {
        mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(this);
        mButton2 = (TextView) findViewById(R.id.button2);
        mButton2.setOnClickListener(this);

    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onClick(final View v) {

        if (v == mButton1) {
            sId ++;
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(instance,CHANNEL_ID)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setSmallIcon( R.mipmap.ic_launcher)
                    .setTicker("hello world")
                    .setWhen(System.currentTimeMillis())
                    .setAutoCancel(true)
                    .setContentText("this is notification")
                    .setContentTitle("chapter_5")
                    .setOnlyAlertOnce(false)
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                    .setPriority(NotificationCompat.PRIORITY_HIGH);

            Intent fullScreenIntent = new Intent(instance, DemoActivity_2.class);
            PendingIntent fullScreenPendingIntent = PendingIntent.getActivity(this, 0,
                    fullScreenIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//            mBuilder.setFullScreenIntent(fullScreenPendingIntent, true);

            mBuilder.setContentIntent(fullScreenPendingIntent);
            manager.notify(sId, mBuilder.build());
        } else if (v == mButton2) {
            sId ++;
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(instance,CHANNEL_ID)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                    .setSmallIcon( R.mipmap.ic_launcher)
                    .setTicker("hello world")
                    .setWhen(System.currentTimeMillis())
                    .setAutoCancel(true);

            Intent intent = new Intent(instance, DemoActivity_1.class);
            intent.putExtra("sid", "" + sId);
            PendingIntent pendingIntent = PendingIntent.getActivity(instance,
                    0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            System.out.println(pendingIntent);
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.layout_notification);
            remoteViews.setTextViewText(R.id.msg, "chapter_5: " + sId);
            remoteViews.setImageViewResource(R.id.icon, R.drawable.icon1);
            PendingIntent openActivity2PendingIntent = PendingIntent.getActivity(instance,
                    0, new Intent(instance, DemoActivity_2.class), PendingIntent.FLAG_UPDATE_CURRENT);
            remoteViews.setOnClickPendingIntent(R.id.open_activity2, openActivity2PendingIntent);
            mBuilder.setCustomContentView(remoteViews)
                    .setCustomBigContentView(remoteViews)
                    .setContentIntent(pendingIntent);
            manager.notify(sId, mBuilder.build());
        }

    }

}
