package com.meishe.msmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.meishe.msmvvm.databinding.ActivityMainBinding;

/**
 * @author ms
 */
public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Person user=new Person("赵敏","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500","https://img0.baidu.com/it/u=658809023,3560726099&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500");
        activityMainBinding.setUser(user);
        imageView=findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,ListActivity.class));
                startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
            }
        });
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.e("lpf","postDelayed 恬希");
                user.setName("恬希");
            }
        },2000);
    }
}