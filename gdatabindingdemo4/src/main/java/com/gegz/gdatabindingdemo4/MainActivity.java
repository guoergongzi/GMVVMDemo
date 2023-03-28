package com.gegz.gdatabindingdemo4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Application;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.gegz.gdatabindingdemo4.databinding.ActivityMainBinding;

import javax.net.ssl.HttpsURLConnection;

/**
 * Demo主界面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // 测试自定义属性
        mainBinding.setImageUrl("https://profile.csdnimg.cn/C/B/6/1_wccadab");
        // 测试自定义属性组合
        mainBinding.setViewHeight(200);
        mainBinding.setViewWidth(300);
        // 测试自定义属性覆盖系统属性
        mainBinding.setTextContent("测试");
    }
}