package com.gegz.gdatabindingdemo2.utils2;

import android.content.Context;

import com.gegz.gdatabindingdemo2.MainActivity;

public class Utils {

    public static String isMainActivity2(Context context) {
        if (context instanceof MainActivity) {
            return "是MainActivity";
        }
        return "不是MainActivity";
    }
}
