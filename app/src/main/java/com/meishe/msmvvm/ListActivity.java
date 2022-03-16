package com.meishe.msmvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    List<Person> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=findViewById(R.id.listView);
        data=Util.getData();
        listView.setAdapter(new CommAdapter<Person>(this,getLayoutInflater(),R.layout.activity_main,
                BR.user,data));
    }

}