package com.meishe.msmvvm;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * * All rights reserved,Designed by www.meishesdk.com
 *
 * @Author : lpf
 * @CreateDate : 2022/3/15 下午6:37
 * @Description :
 * @Copyright :www.meishesdk.com Inc.All rights reserved.
 */
public class CommonRecyclerViewAdapter<T> extends RecyclerView.Adapter<CommonRecyclerViewAdapter<T>.CommonViewHolder> {

    private List<T> mList;
    private int variableId;
    private int layoutItemId;

    public CommonRecyclerViewAdapter(int layoutItemId,int variableId,List<T> mList) {
        this.mList = mList;
        this.variableId=variableId;
        this.layoutItemId=layoutItemId;
    }

    @Override
    public void onBindViewHolder(@NonNull CommonViewHolder holder, int position) {
        holder.getViewDataBinding().setVariable(variableId, mList.get(position));
    }


    @NonNull
    @Override
    public CommonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                layoutItemId, parent, false);
        return new CommonViewHolder(viewDataBinding);
    }

    @Override
    public int getItemCount() {
        return mList==null?0:mList.size();
    }

    class CommonViewHolder extends RecyclerView.ViewHolder{

         ViewDataBinding viewDataBinding;
        public CommonViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.viewDataBinding=binding;
        }

        public ViewDataBinding getViewDataBinding() {
            return viewDataBinding;
        }
    }
}
