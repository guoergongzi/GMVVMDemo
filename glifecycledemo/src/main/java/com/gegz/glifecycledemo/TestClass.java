package com.gegz.glifecycledemo;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public class TestClass implements DefaultLifecycleObserver {

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onResume(owner);
        Toast.makeText((Context) owner, "测试内容", Toast.LENGTH_SHORT).show();
    }
}
