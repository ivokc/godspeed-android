package com.example.myapplication.advancelight.chapter9.dagger2.module;


import com.example.myapplication.advancelight.chapter9.dagger2.model.Swordsman;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
@Module
public class SwordsmanModule {
    @Provides
    public Swordsman provideSwordsman() {
        return new Swordsman();
    }
}

