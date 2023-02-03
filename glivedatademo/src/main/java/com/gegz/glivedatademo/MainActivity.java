package com.gegz.glivedatademo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestViewModel viewModel = new ViewModelProvider(this).get(TestViewModel.class);
        viewModel.startTimer();

        TextView textView = findViewById(R.id.tv_live_data_demo);
        LifecycleOwner owner = MainActivity.this;
        viewModel.getTimeCount().observe(owner, integer -> {
            String textString = "计时到第" + integer + "秒";
            textView.setText(textString);
            Log.v("G", "timeCount = " + integer);
        });
    }
}