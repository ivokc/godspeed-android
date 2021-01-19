package com.example.myapplication.advancelight.chapter5.okhttp3;

import java.io.IOException;

import okhttp3.Request;

/**
 * Created by Administrator on 2016/10/27 0027.
 */

public abstract class ResultCallback
{
    public abstract void onError(Request request, Exception e);

    public abstract void onResponse(String str) throws IOException;
}