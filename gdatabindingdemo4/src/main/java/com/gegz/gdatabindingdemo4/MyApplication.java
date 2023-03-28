package com.gegz.gdatabindingdemo4;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.instance = this;
    }
}
