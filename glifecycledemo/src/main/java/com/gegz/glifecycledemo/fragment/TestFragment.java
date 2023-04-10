package com.gegz.glifecycledemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 测试fragment使用lifeCycle
 */
public class TestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 添加LifeCycle监听
        getLifecycle().addObserver(new FragmentTestClass());
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
