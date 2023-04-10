package com.gegz.glifecycledemo;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * 测试Activity使用LifeCycle
 */
public class TestClass implements DefaultLifecycleObserver {

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onResume(owner);
        Toast.makeText(MyApplication.getInstance(), "测试内容", Toast.LENGTH_SHORT).show();
    }
}
