package com.gegz.gviewmodeldemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TestViewModel viewModel = new ViewModelProvider(this).get(TestViewModel.class);
        viewModel.startTimer();

        Button timeButton = findViewById(R.id.btn_view_model_demo);

        timeButton.setOnClickListener(view -> {
            Toast.makeText(NewActivity.this, "计时到第" + viewModel.getTimeCount() + "秒", Toast.LENGTH_SHORT).show();
        });
    }
}
