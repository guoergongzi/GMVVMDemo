package com.gegz.glifecycledemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/**
 * 测试service使用lifeCycle
 */
public class TestService2 extends Service implements LifecycleOwner {

    private final LifecycleRegistry mRegistry = new LifecycleRegistry(this);

    @Override
    public void onCreate() {
        super.onCreate();
        mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        mRegistry.addObserver(new ServiceTestClass2());
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return mRegistry;
    }
}
