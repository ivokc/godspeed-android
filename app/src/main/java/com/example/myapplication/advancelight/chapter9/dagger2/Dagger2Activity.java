package com.example.myapplication.advancelight.chapter9.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter9.dagger2.model.Car;
import com.example.myapplication.advancelight.chapter9.dagger2.model.Man;
import com.example.myapplication.advancelight.chapter9.dagger2.model.Watch;
import com.example.myapplication.MyApplication;
import com.google.gson.Gson;

import javax.inject.Inject;

public class Dagger2Activity extends AppCompatActivity {

    private static final String TAG="Dagger2";
    private Button bt_jump;
    @Inject
    Watch watch;
    @Inject
    Gson gson;
    @Inject
    Gson gson1;
    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2);

        //        DaggerActivityComponent.builder().build().inject(this);
        MyApplication.get(Dagger2Activity.this).getActivityComponent().inject(this);
        onClick();
        watch.work();
        String jsonData = "{'name':'zhangwuji', 'age':20}";
        Man man = gson.fromJson(jsonData, Man.class);
        Log.d(TAG, "name---" + man.getName());
        String str = car.run();
        Log.d(TAG, "car---" + str);
        Log.d(TAG, gson.hashCode() + "---------" + gson1.hashCode());

    }
    private void onClick() {
        bt_jump = (Button) findViewById(R.id.bt_jump);
        bt_jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dagger2Activity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}