package com.example.myapplication.advancelight.chapter9.dagger2.module;


import com.example.myapplication.advancelight.chapter9.dagger2.annotation.Diesel;
import com.example.myapplication.advancelight.chapter9.dagger2.annotation.Gasoline;
import com.example.myapplication.advancelight.chapter9.dagger2.model.DieselEngine;
import com.example.myapplication.advancelight.chapter9.dagger2.model.Engine;
import com.example.myapplication.advancelight.chapter9.dagger2.model.GasolineEngine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/12/18 0018.
 */
@Module
public class EngineModule {
    @Provides
    @Gasoline
    public Engine provideGasoline() {
        return new GasolineEngine();
    }

    @Provides
    @Diesel
    public Engine provideDiesel() {
        return new DieselEngine();
    }
}
