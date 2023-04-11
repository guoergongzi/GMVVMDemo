package com.gegz.glifecycledemo.app;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

public class MyApplication extends Application {

    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.instance = this;
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationTestClass());
    }
}
