package com.example.myapplication.advancelight.chapter9.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/18 0018.
 */

public class Watch {
    @Inject
    public Watch(){

    }
    public void work(){
        Log.d("Dagger2","手表工作");
    }
}
