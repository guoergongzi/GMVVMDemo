package com.gegz.glifecycledemo.app;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * 测试在application中使用lifecycle
 */
public class ApplicationTestClass implements DefaultLifecycleObserver {

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onResume(owner);
        Log.e("测试App中使用LifeCycle", "onResume");
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onPause(owner);
        Log.e("测试App中使用LifeCycle", "onPause");
    }
}
