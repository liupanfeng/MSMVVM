package com.meishe.msmvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import java.util.List;

/**
 * * All rights reserved,Designed by www.meishesdk.com
 *
 * @Author : lpf
 * @CreateDate : 2022/3/15 下午5:44
 * @Description :
 * @Copyright :www.meishesdk.com Inc.All rights reserved.
 */
public class CommAdapter<T> extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private int layoutId;

    //variable的ID，，自动生成
    private int variableId;
    private List<T> list;

    public CommAdapter(Context context, LayoutInflater inflater, int layoutId, int variableId, List<T> list) {
        this.context = context;
        this.inflater = inflater;
        this.layoutId = layoutId;
        this.variableId = variableId;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int i) {
        return list==null?null:list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewDataBinding viewDataBinding;
        if (view==null){
            viewDataBinding= DataBindingUtil.inflate(inflater,layoutId,viewGroup,false);
        }else{
            viewDataBinding=DataBindingUtil.getBinding(view);
        }
        viewDataBinding.setVariable(variableId,list.get(i));
        return viewDataBinding.getRoot().getRootView();
    }
}
