package com.jacky.cardview2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lhm05 on 2016/07/27.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<String> data;

    public MyAdapter(List<String> data)
    {this.data=data;}

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.dataitem,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView.setText(data.get(position).toString());
    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder
    {
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.info_text);

        }
    }







}
