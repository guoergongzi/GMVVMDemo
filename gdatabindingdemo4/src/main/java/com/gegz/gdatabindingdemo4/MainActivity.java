package com.gegz.gdatabindingdemo4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.gegz.gdatabindingdemo4.databinding.ActivityMainBinding;
import com.gegz.gdatabindingdemo4.databinding.LayoutIncludeTestBinding;

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
        // 测试lambda表达式
        mainBinding.setClickProcessor(new ClickProcessor());
        // 测试include布局
        mainBinding.setIncludeString("测试include布局");
        // 测试viewStub布局
        if (mainBinding.layoutStub.getViewStub() != null) {
            mainBinding.layoutStub.getViewStub().inflate();
            mainBinding.setViewStubString("测试viewStub布局");
        }
    }
}