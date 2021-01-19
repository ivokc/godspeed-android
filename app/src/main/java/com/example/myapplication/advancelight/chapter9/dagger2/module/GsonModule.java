package com.example.myapplication.advancelight.chapter9.dagger2.module;

import com.example.myapplication.advancelight.chapter9.dagger2.annotation.ApplicationScope;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/12/18 0018.
 */

@Module
public class GsonModule {
    @ApplicationScope
    @Provides
    public Gson provideGson() {
        return new Gson();
    }
}
