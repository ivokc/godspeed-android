package com.example.myapplication.advancelight.chapter9.dagger2.component;


import com.example.myapplication.advancelight.chapter9.dagger2.model.Swordsman;
import com.example.myapplication.advancelight.chapter9.dagger2.module.SwordsmanModule;

import dagger.Component;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
@Component(modules = SwordsmanModule.class)
public interface SwordsmanComponent {
    Swordsman getSwordsman();
}
