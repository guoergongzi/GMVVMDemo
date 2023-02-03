package com.gegz.gdatabindingdemo2.utils;

import android.content.Context;

import com.gegz.gdatabindingdemo2.MainActivity;

public class Utils {

    public static String processString(String original) {
        return original.toUpperCase();
    }

    public static String isMainActivity(Context context) {
        if (context instanceof MainActivity) {
            return "是MainActivity";
        }
        return "不是MainActivity";
    }
}

