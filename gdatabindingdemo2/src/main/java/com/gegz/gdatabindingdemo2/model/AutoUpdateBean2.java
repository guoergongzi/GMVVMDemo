package com.gegz.gdatabindingdemo2.model;

import androidx.databinding.ObservableField;

/**
 * 测试数据绑定另一种实现方式的实体类
 */
public class AutoUpdateBean2 {

    public final ObservableField<String> name;

    private final ObservableField<String> id;

    private final ObservableField<Float> price;

    public AutoUpdateBean2() {
        name = new ObservableField<>();
        id = new ObservableField<>();
        price = new ObservableField<>();
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableField<String> getId() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public ObservableField<Float> getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price.set(price);
    }
}
