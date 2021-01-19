package com.example.myapplication.advancelight.chapter9.dagger2.component;

import com.example.myapplication.advancelight.chapter9.dagger2.Dagger2Activity;
import com.example.myapplication.advancelight.chapter9.dagger2.SecondActivity;
import com.example.myapplication.advancelight.chapter9.dagger2.annotation.ApplicationScope;
import com.example.myapplication.advancelight.chapter9.dagger2.module.EngineModule;
import com.example.myapplication.advancelight.chapter9.dagger2.module.GsonModule;

import dagger.Component;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@ApplicationScope
@Component(modules = {GsonModule.class, EngineModule.class},dependencies = SwordsmanComponent.class)
public interface ActivityComponent {
    void inject(Dagger2Activity activity);
    void inject(SecondActivity activity);
}
