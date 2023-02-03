package com.gegz.gviewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jumpButton = findViewById(R.id.btn_view_model_demo_jump);

        jumpButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, NewActivity.class));
        });
    }
}