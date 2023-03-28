package com.gegz.gdatabindingdemo4;

import android.widget.ImageView;

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
}
