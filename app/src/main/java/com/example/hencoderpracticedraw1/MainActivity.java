package com.example.hencoderpracticedraw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FrameLayout frameLayout;
    private List<String> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycle_view);
        frameLayout=(FrameLayout)findViewById(R.id.frame_layout);
        initdata();
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        RecycleAdapter adapter=new RecycleAdapter(list,this);
        recyclerView.setAdapter(adapter);
    }
    private void initdata(){
        String[] names=new String[]{
                "Test",
                "Test2",
              "drawColor",
              "drawCircle",
              "直方图",
              "饼图"
        };
        for(int i=0;i<names.length;i++){
            list.add(names[i]);
        }
    }
}
