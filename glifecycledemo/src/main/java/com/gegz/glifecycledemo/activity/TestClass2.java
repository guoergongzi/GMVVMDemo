package com.gegz.glifecycledemo.activity;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.gegz.glifecycledemo.app.MyApplication;

/**
 * 测试Activity使用LifeCycle
 */
public class TestClass2 implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Toast.makeText(MyApplication.getInstance(), "测试内容2", Toast.LENGTH_SHORT).show();
    }
}
