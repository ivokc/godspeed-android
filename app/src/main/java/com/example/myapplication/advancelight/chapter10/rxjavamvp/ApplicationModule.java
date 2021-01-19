package com.example.myapplication.advancelight.chapter10.rxjavamvp;

import android.content.Context;

import dagger.Module;
import dagger.Provides;


@Module
public final class ApplicationModule {
    private final Context mContext;
    ApplicationModule(Context context) {
        mContext = context;
    }
    @Provides
    Context provideContext() {
        return mContext;
    }
}