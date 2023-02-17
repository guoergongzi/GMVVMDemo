package com.gegz.gdatabindingdemo2.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.gegz.gdatabindingdemo2.BR;

/**
 * 测试数据绑定的实体类
 */
public class AutoUpdateBean extends BaseObservable {

    // public修饰的成员变量可以直接在成员变量上添加@Bindable注解
    @Bindable
    public String name;

    private String id;

    // private修饰的成员变量要在get方法上添加@Bindable注解
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyChange();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
