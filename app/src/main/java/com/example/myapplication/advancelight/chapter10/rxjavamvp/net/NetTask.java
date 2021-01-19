package com.example.myapplication.advancelight.chapter10.rxjavamvp.net;


import com.example.myapplication.advancelight.chapter10.rxjavamvp.LoadTasksCallBack;

import rx.Subscription;

/**
 * Created by Administrator on 2016/12/29 0029.
 */

public interface NetTask<T> {
    Subscription execute(T data, LoadTasksCallBack callBack);
}
