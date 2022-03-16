package com.meishe.msmvvm;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * * All rights reserved,Designed by www.meishesdk.com
 *
 * @Author : lpf
 * @CreateDate : 2022/3/15 下午8:51
 * @Description :
 * @Copyright :www.meishesdk.com Inc.All rights reserved.
 */
public class Util {

    public static List<Person> getData(){
        List<Person> data=new ArrayList<>();
        String girlUrl="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2F82%2Fce%2Fce%2F82cece1703856a860cb39d6a22d7ca26.jpg&refer=http%3A%2F%2Fup.enterdesk.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1649941563&t=f461ce311336ef90208eaa8b2dc035a1";
        data.add(new Person("赵敏","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500","https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2F82%2Fce%2Fce%2F82cece1703856a860cb39d6a22d7ca26.jpg&refer=http%3A%2F%2Fup.enterdesk.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1649941563&t=f461ce311336ef90208eaa8b2dc035a1"));
        data.add(new Person("周之若","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500","https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2F82%2Fce%2Fce%2F82cece1703856a860cb39d6a22d7ca26.jpg&refer=http%3A%2F%2Fup.enterdesk.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1649941563&t=f461ce311336ef90208eaa8b2dc035a1"));
        data.add(new Person("珠儿","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500","https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fup.enterdesk.com%2Fedpic%2F82%2Fce%2Fce%2F82cece1703856a860cb39d6a22d7ca26.jpg&refer=http%3A%2F%2Fup.enterdesk.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1649941563&t=f461ce311336ef90208eaa8b2dc035a1"));
        data.add(new Person("小昭","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("赵敏","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("周之若","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("珠儿","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("小昭","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("赵敏","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("周之若","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("珠儿","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        data.add(new Person("小昭","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",girlUrl));
        return data;
    }


    @BindingAdapter("url")
    public static void setImage(ImageView imageView, String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
}
