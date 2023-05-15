package com.example.hw1;

import java.io.Serializable;

public class User implements Serializable {

    private  String name, location, time, time2, price;

    public User(String name, String location, String time, String time2, String price) {
        this.name = name;
        this.location = location;
        this.time = time;
        this.time2 = time2;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getTime2() {
        return time2;
    }
    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}