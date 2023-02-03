package com.gegz.gdatabindingdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.gegz.gdatabindingdemo2.databinding.TestBinding;
import com.gegz.gdatabindingdemo2.model.UserInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        binding.tvMain.setText("测试");

        binding.setVariable(BR.textString, "测试");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("Android小郭");
        userInfo.setAvatar("https://profile.csdnimg.cn/C/B/6/1_wccadab");
        binding.setVariable(BR.userInfo, userInfo);
    }
}