package com.example.yunhao.picshow;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private food[] Food={new food("智能养生食谱",R.drawable.a),new food("薏米粥",R.drawable.b)
            ,new food("桂圆百合莲子",R.drawable.c),new food("川贝蒸梨",R.drawable.d)
            ,new food("酸奶",R.drawable.e),new food("核桃",R.drawable.f)
            ,new food("羊肉汤",R.drawable.g)};

    private List<food> fruitList=new ArrayList<>();

    private foodAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfoods();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new foodAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initfoods(){
        fruitList.clear();
        for (int i = 0; i <7 ; i++) {
            fruitList.add(Food[i]);
        }
    }

}
