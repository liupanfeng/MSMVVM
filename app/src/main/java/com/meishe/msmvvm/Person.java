package com.meishe.msmvvm;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

/**
 * * All rights reserved,Designed by www.meishesdk.com
 *
 * @Author : lpf
 * @CreateDate : 2022/3/15 下午12:29
 * @Description :
 * @Copyright :www.meishesdk.com Inc.All rights reserved.
 */
public class Person extends BaseObservable {

    private String name;
    private String photo;
    private String face;

    public Person(String name, String photo, String face) {
        this.name = name;
        this.photo = photo;
        this.face = face;
    }


    @Bindable
    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
        notifyPropertyChanged(BR.face);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
        notifyPropertyChanged(BR.photo);
    }


}
