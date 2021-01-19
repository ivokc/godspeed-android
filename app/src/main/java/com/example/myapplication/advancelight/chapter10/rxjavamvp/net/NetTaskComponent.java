package com.example.myapplication.advancelight.chapter10.rxjavamvp.net;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/1/2 0002.
 */
@Singleton
@Component(modules =NetTaskModule.class)
public interface NetTaskComponent {
    NetTask getNetTask();
}
