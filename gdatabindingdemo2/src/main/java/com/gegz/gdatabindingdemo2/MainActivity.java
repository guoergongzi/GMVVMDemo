package com.gegz.gdatabindingdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableMap;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gegz.gdatabindingdemo2.databinding.TestBinding;
import com.gegz.gdatabindingdemo2.model.AutoUpdateBean;
import com.gegz.gdatabindingdemo2.model.AutoUpdateBean2;
import com.gegz.gdatabindingdemo2.model.MutuallyUpdateBean;
import com.gegz.gdatabindingdemo2.model.UserInfo;

import java.util.Random;

/**
 * Demo主界面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置布局文件并获取DataBinding对象
        TestBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 测试用DataBinding对象获取控件对象
//        binding.tvMain.setText("测试");
        // 测试给xml文件绑定数据
        binding.setVariable(BR.textString, "测试");
        // 测试给xml文件绑定实体类
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("Android小郭");
        userInfo.setAvatar("https://profile.csdnimg.cn/C/B/6/1_wccadab");
        binding.setVariable(BR.userInfo, userInfo);
        // 测试数据绑定
        AutoUpdateBean autoUpdateBean = new AutoUpdateBean();
        autoUpdateBean.setName("name:");
        autoUpdateBean.setId("id:");
        autoUpdateBean.setPrice(121);
        binding.setVariable(BR.autoUpdateBean, autoUpdateBean);
        binding.btnMainAutoName.setOnClickListener(v -> {
            autoUpdateBean.setName("name:" + new Random().nextInt(100));
            autoUpdateBean.setPrice(new Random().nextInt(100));
        });
        binding.btnMainAutoId.setOnClickListener(v -> {
            autoUpdateBean.setId("id:" + new Random().nextInt(100));
            autoUpdateBean.setPrice(new Random().nextInt(100));
        });
        // 测试另一种数据绑定
        AutoUpdateBean2 autoUpdateBean2 = new AutoUpdateBean2();
        autoUpdateBean2.setName("name:");
        autoUpdateBean2.setId("id:");
        autoUpdateBean2.setPrice(121);
        binding.setVariable(BR.autoUpdateBean2, autoUpdateBean2);
        binding.btnMainAutoName2.setOnClickListener(v -> {
            autoUpdateBean2.setName("name:" + new Random().nextInt(100));
            autoUpdateBean2.setPrice(new Random().nextInt(100));
        });
        binding.btnMainAutoId2.setOnClickListener(v -> {
            autoUpdateBean2.setId("id:" + new Random().nextInt(100));
            autoUpdateBean2.setPrice(new Random().nextInt(100));
        });
        ObservableMap<String, String> map = new ObservableArrayMap<>();
        map.put("name", "leavesC");
        map.put("age", "24");
        binding.setVariable(BR.map, map);
        binding.setKey("name");
        binding.btnMainMapUpdate.setOnClickListener(v -> map.put("name", "leavesC,hi" + new Random().nextInt(100)));
        // 测试绑定事件
        View.OnClickListener onClickListener = v -> Toast.makeText(MainActivity.this, "测试点击事件", Toast.LENGTH_SHORT).show();
        // binding.setVariable(BR.clickListener, onClickListener);
        binding.setClickListener(onClickListener);
        binding.setVariable(BR.mutuallyContent, new MutuallyUpdateBean());
    }
}