package com.example.testandroid.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class FoodAdapter  extends RecyclerView.Adapter{


    List Foodlist;
    public  FoodAdapter(List FoodList){

    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate();

    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);

        }
    }
}
