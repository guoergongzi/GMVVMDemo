package com.gegz.glifecycledemo.service;

import androidx.lifecycle.LifecycleService;

/**
 * 测试service使用lifeCycle
 */
public class TestService extends LifecycleService {

    @Override
    public void onCreate() {
        super.onCreate();
        getLifecycle().addObserver(new ServiceTestClass());
    }
}
