package com.example.myapplication.advancelight.chapter10.simplemvp.net;


/**
 * Created by Administrator on 2016/12/29 0029.
 */

public interface NetTask<T> {
    void execute(T data, LoadTasksCallBack callBack);
}
