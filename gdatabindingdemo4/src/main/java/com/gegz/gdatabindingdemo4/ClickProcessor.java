package com.gegz.gdatabindingdemo4;

import android.content.Context;
import android.widget.Toast;

/**
 * 测试lambda表达式
 */
public class ClickProcessor {

    /**
     * 点击按钮后显示Toast
     */
    public void showToast(Context context) {
        Toast.makeText(context, "点击了测试按钮", Toast.LENGTH_SHORT).show();
    }
}
