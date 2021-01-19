package com.example.myapplication;


import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.util.Log;

import com.example.myapplication.advancelight.chapter10.rxjavamvp.net.DaggerNetTaskComponent;
import com.example.myapplication.advancelight.chapter10.rxjavamvp.net.NetTaskComponent;
import com.example.myapplication.advancelight.chapter10.rxjavamvp.net.NetTaskModule;
import com.example.myapplication.advancelight.chapter9.dagger2.component.ActivityComponent;
import com.example.myapplication.advancelight.chapter9.dagger2.component.DaggerActivityComponent;
import com.example.myapplication.advancelight.chapter9.dagger2.component.DaggerSwordsmanComponent;
import com.example.myapplication.art.chapter2.utils.MyUtils;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";
    //dagger2例子
    ActivityComponent activityComponent;
    private NetTaskComponent netTaskComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        //演示多进程
        String processName = MyUtils.getProcessName(getApplicationContext(),
                Process.myPid());
        Log.d(TAG, "application start, process name:" + processName);
        new Thread(new Runnable() {

            @Override
            public void run() {
                doWorkInBackground();
            }
        }).start();


        activityComponent= DaggerActivityComponent.builder().swordsmanComponent(DaggerSwordsmanComponent.builder().build()).build();
        netTaskComponent= DaggerNetTaskComponent.builder().netTaskModule(new NetTaskModule()).build();


        //advanceligth chapter10 simplemvp用到
        OkHttpFinalConfiguration.Builder builder = new OkHttpFinalConfiguration.Builder();
        OkHttpFinal.getInstance().init(builder.build());
    }
    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }
    public ActivityComponent getActivityComponent(){
        return activityComponent;
    }
    public NetTaskComponent getTasksRepositoryComponent() {
        return netTaskComponent;
    }

    private void doWorkInBackground() {
        // init binder pool
//        BinderPool.getInsance(getApplicationContext());
    }
}
