package com.gegz.glifecycledemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleRegistry;

import android.content.Intent;
import android.os.Bundle;

import com.gegz.glifecycledemo.R;
import com.gegz.glifecycledemo.fragment.TestFragment;
import com.gegz.glifecycledemo.service.TestService;
import com.gegz.glifecycledemo.service.TestService2;

/**
 * 主界面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置布局文件
        DataBindingUtil.setContentView(this, R.layout.activity_main);
        // 添加LifeCycle监听
        getLifecycle().addObserver(new TestClass());
        // 测试其它观察者的实现方式
        getLifecycle().addObserver(new TestClass2());
        // 添加Fragment中使用lifecycle
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layout_fragment, new TestFragment());
        fragmentTransaction.commitAllowingStateLoss();
        // 测试service中使用lifecycle
        Intent intent = new Intent(this, TestService.class);
        startService(intent);
        // 测试自定义LifeCycleOwner
        Intent intent2 = new Intent(this, TestService2.class);
        startService(intent2);

        new LifecycleRegistry(this);
    }
}