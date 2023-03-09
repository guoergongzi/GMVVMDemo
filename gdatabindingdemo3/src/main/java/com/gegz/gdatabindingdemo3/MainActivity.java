package com.gegz.gdatabindingdemo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.gegz.gdatabindingdemo3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setNum1(123);
        mainBinding.setNum2(234);
        mainBinding.setStr1("aaa");
        mainBinding.setStr2("bbb");
        mainBinding.setBoolean1(true);
        mainBinding.setBoolean2(false);
        mainBinding.setStr5("ccc");
    }
}