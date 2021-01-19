package com.example.myapplication.advancelight.chapter10.rxjavamvp;

public interface LoadTasksCallBack<T> {
    void onSuccess(T t);
    void onStart();
    void onFailed();
    void onFinish();
}
