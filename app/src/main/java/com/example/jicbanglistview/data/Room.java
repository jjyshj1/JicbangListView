package com.example.jicbanglistview.data;

public class Room {

   public int deposit;//보증금
    public int month_pay;//울세

    public String location;//대략적인 지역
    public int floor; //층(지하면 음수)

    public String description; //설명

    //alt+insert키 눌러서 construct 생성
    public Room(int deposit, int month_pay, String location, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.location = location;
        this.floor = floor;
        this.description = description;
    }
}
