package com.example.myapplication.advancelight.chapter9.dagger2.model;


import com.example.myapplication.advancelight.chapter9.dagger2.annotation.Gasoline;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/18 0018.
 */

public class Car {
    private Engine engine;

    @Inject
    public Car(@Gasoline Engine engine) {
        this.engine = engine;
    }

    public String run() {
        return engine.work();
    }
}
