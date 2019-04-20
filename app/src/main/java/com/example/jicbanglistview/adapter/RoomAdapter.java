package com.example.jicbanglistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.jicbanglistview.R;
import com.example.jicbanglistview.data.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;


    public RoomAdapter(Context context, List<Room> list){
        super(context, R.layout.room_list_item, list);     //이줄...특히 마지막 list를 빠트리는경우 많음

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.room_list_item,null);
        }
        return row;

    }
}
