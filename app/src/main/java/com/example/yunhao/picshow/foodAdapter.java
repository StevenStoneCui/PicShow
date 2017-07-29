package com.example.yunhao.picshow;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by JayDragon on 2017/1/4 0004.
 */

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.ViewHolder> {
    private Context mContext;
    private List<food> mfoodList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView foodImage;
        TextView foodName;
        public ViewHolder(View view) {
            super(view);
            cardView=(CardView)view;
            foodImage=(ImageView)view.findViewById(R.id.food_image);
            foodName=(TextView)view.findViewById(R.id.food_name);
        }
    }

    public foodAdapter(List<food> foodList) {
        this.mfoodList = foodList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext==null){
            mContext=parent.getContext();
        }
        View view= LayoutInflater.from(mContext).inflate(R.layout.food_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        food fruit=mfoodList.get(position);
        holder.foodName.setText(fruit.getName());
        Glide.with(mContext).load(fruit.getImageId()).into(holder.foodImage);
    }

    @Override
    public int getItemCount() {
        return mfoodList.size();
    }
}
