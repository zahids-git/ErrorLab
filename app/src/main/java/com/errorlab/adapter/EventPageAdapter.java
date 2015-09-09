package com.errorlab.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.errorlab.R;

import java.util.ArrayList;

/**
 * Created by Md.Zahidul on 06-Sep-15.
 */
public class EventPageAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;

    ArrayList<String> date,month,year,time,header,body,fblink,readMoreLink;



    public EventPageAdapter(Context context, ArrayList<String> date){
        this.context=context;
        this.date=date;
    }


    @Override
    public int getCount() {
        return date.size();
    }

    @Override
    public Object getItem(int position) {
        return date.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.event_custom_listview, null, true);
        return view;
    }
}
