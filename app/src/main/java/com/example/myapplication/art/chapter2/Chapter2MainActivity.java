package com.example.myapplication.art.chapter2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.art.chapter2.aidl.BookManagerActivity;
import com.example.myapplication.art.chapter2.binderpool.BinderPoolActivity;
import com.example.myapplication.art.chapter2.manager.UserManager;
import com.example.myapplication.art.chapter2.messenger.MessengerActivity;
import com.example.myapplication.art.chapter2.model.User;
import com.example.myapplication.art.chapter2.provider.ProviderActivity;
import com.example.myapplication.art.chapter2.socket.TCPClientActivity;
import com.example.myapplication.art.chapter2.utils.MyConstants;
import com.example.myapplication.art.chapter2.utils.MyUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Chapter2MainActivity extends AppCompatActivity {


    private static final String TAG = "Chapter2MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2_main2);

        UserManager.sUserId = 2;
        findViewById(R.id.second_activity).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Chapter2MainActivity.this, SecondActivity.class);
                User user = new User(0, "jake", true);
                //序列化方式传intent数据
                intent.putExtra("extra_user", (Serializable) user);
                startActivity(intent);
            }
        });
        findViewById(R.id.messenger_activity).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Chapter2MainActivity.this, MessengerActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.aidl_activity).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Chapter2MainActivity.this, BookManagerActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.content_provider_activity).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Chapter2MainActivity.this, ProviderActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.socket_activity).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Chapter2MainActivity.this, TCPClientActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.binder_pool_activity).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Chapter2MainActivity.this, BinderPoolActivity.class);
                startActivity(intent);
            }
        });



    }
    @Override
    protected void onResume() {
        Log.d(TAG, "UserManage.sUserId=" + UserManager.sUserId);
        persistToFile();

        super.onResume();
    }


    //序列化，共享文件方式ipc
    private void persistToFile() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                User user = new User(1, "hello world", false);
                File dir = new File(MyConstants.CHAPTER_2_PATH);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File cachedFile = new File(MyConstants.CACHE_FILE_PATH);
                ObjectOutputStream objectOutputStream = null;
                try {
                    objectOutputStream = new ObjectOutputStream(
                            new FileOutputStream(cachedFile));
                    objectOutputStream.writeObject(user);
                    Log.d(TAG, "persist user:" + user);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    MyUtils.close(objectOutputStream);
                }
            }
        }).start();
    }
}