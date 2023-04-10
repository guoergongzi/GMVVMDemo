package com.gegz.glifecycledemo.fragment;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

import com.gegz.glifecycledemo.MyApplication;

/**
 * 测试fragment使用lifeCycle
 */
public class FragmentTestClass implements DefaultLifecycleObserver {

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onResume(owner);
        Toast.makeText(MyApplication.getInstance(), "测试Fragment中使用LifeCycle", Toast.LENGTH_SHORT).show();
    }
}
