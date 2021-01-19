package com.example.myapplication.advancelight.chapter10.rxjavamvp.ipinfo;


import com.example.myapplication.advancelight.chapter10.rxjavamvp.FragmentScoped;
import com.example.myapplication.advancelight.chapter10.rxjavamvp.net.NetTaskComponent;

import dagger.Component;

/**
 * Created by Administrator on 2017/1/2 0002.
 */
@FragmentScoped
@Component(dependencies = NetTaskComponent.class,modules = IpInfoModule.class)
public interface IpInfoComponent {
    void inject(IpInfoActivity ipInfoActivity);
}
