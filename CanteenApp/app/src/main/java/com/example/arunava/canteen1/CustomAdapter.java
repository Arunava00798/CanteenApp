package com.example.arunava.canteen1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<DataModel> arrayList = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<DataModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder{
        TextView txt_dispq,txt_dispitem;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view==null){
            view=inflater.inflate(R.layout.rowlast,null);
            holder=new ViewHolder();

            holder.txt_dispitem=view.findViewById(R.id.txt_dispitem);
            holder.txt_dispq=view.findViewById(R.id.txt_dispq);

            view.setTag(holder);
        }
        else{
            holder=(ViewHolder)view.getTag();
        }

        holder.txt_dispq.setText(arrayList.get(position).getQuantity());
        holder.txt_dispitem.setText((arrayList.get(position).getItem()));

        return view;
    }
}