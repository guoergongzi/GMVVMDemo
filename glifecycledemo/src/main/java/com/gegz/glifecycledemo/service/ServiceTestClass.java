package com.gegz.glifecycledemo.service;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

import com.gegz.glifecycledemo.MyApplication;

/**
 * 测试service使用lifeCycle
 */
public class ServiceTestClass implements DefaultLifecycleObserver {

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onCreate(owner);
        Toast.makeText(MyApplication.getInstance(), "测试Service中使用LifeCycle", Toast.LENGTH_SHORT).show();
    }
}
