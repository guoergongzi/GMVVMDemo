package com.gegz.gdatabindingdemo2.model;

import androidx.databinding.ObservableField;

/**
 * 测试双向绑定的实体类
 */
public class MutuallyUpdateBean {

    public final ObservableField<String> content;

    public MutuallyUpdateBean() {
        content = new ObservableField<>();
    }

    public ObservableField<String> getContent() {
        return content;
    }
}
