package com.example.myapplication.advancelight.chapter10.simplemvp.net;

public interface LoadTasksCallBack<T> {
    void onSuccess(T t);
    void onStart();
    void onFailed();
    void onFinish();
}
