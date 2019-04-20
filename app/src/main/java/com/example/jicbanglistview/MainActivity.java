package com.example.jicbanglistview;

import android.databinding.DataBindingUtil;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jicbanglistview.adapter.RoomAdapter;
import com.example.jicbanglistview.data.Room;
import com.example.jicbanglistview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RoomAdapter mRoomAdapter;


    List<Room> roomList = new ArrayList<>();

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        act.cleanRoomCountTxt.setText("32개");
        fillRooms();

        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);

        act.roomList.setAdapter(mRoomAdapter);
    }
    void fillRooms(){
        roomList.add(new Room(500, 30, "서구 둔산동",7,"마트인근"));
        roomList.add(new Room(1000, 50, "서구 일동",7,"채광굿"));
        roomList.add(new Room(2000, 100, "북구 광동",5,"학교인근"));
        roomList.add(new Room(300, 10, "동구 제일동",1,"경찰서 뒷편"));
        roomList.add(new Room(1500, 25, "북구 오치동",3,"화장실 3개"));
        roomList.add(new Room(2500, 30, "서구 상가동",2,"마트인근"));
        roomList.add(new Room(500, 30, "서구 둔산동",7,"마트인근"));
        roomList.add(new Room(1000, 50, "서구 일동",7,"채광굿"));
        roomList.add(new Room(2000, 100, "북구 광동",5,"학교인근"));
        roomList.add(new Room(300, 10, "동구 제일동",1,"경찰서 뒷편"));
        roomList.add(new Room(1500, 25, "북구 오치동",3,"화장실 3개"));
        roomList.add(new Room(2500, 30, "서구 상가동",2,"마트인근"));
        roomList.add(new Room(500, 30, "서구 둔산동",7,"마트인근"));
        roomList.add(new Room(1000, 50, "서구 일동",7,"채광굿"));
        roomList.add(new Room(2000, 100, "북구 광동",5,"학교인근"));
        roomList.add(new Room(300, 10, "동구 제일동",1,"경찰서 뒷편"));
        roomList.add(new Room(1500, 25, "북구 오치동",3,"화장실 3개"));
        roomList.add(new Room(2500, 30, "서구 상가동",2,"마트인근"));


    }

}



