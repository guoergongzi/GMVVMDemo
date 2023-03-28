package com.gegz.gdatabindingdemo4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

/**
 * 实现BindingAdapter功能的工具类
 */
public class BindingAdapterImpl {

    /**
     * 使用Glide展示网络图片
     */
    @BindingAdapter("bind_imageUrl")
    public static void loadNetImage(ImageView imageView, String imageUrl) {
        Glide.with(imageView.getContext()).load(imageUrl).into(imageView);
    }

    /**
     * 调整控件宽高
     */
    @BindingAdapter({"bind_width", "bind_height"})
    public static void updateViewSize(View view, int width, int height) {
        view.postDelayed(() -> {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
        }, 2000);
    }

    /**
     * 覆盖系统属性
     */
    @BindingAdapter("android:text")
    public static void updateText(TextView textView, String content) {
        textView.setText(content);
        textView.postDelayed(() -> textView.setText(content + "-ABC"), 2000);
    }
}
