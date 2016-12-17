package com.djonique.birdays.model;

import java.util.Calendar;
import java.util.Date;

public class Person implements Item {
    private String name;
    private long date;
    private long phoneNumber;
    private String email;
    private long timeStamp;
    private String lowerCaseName;

    public Person() {
        this.timeStamp = new Date().getTime();
    }

    public Person(String name, long date) {
        this.name = name;
        this.date = date;
    }

    public Person(String name, long date, long phoneNumber, String email, long timeStamp,
                  String lowerCaseName) {
        this.name = name;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.timeStamp = timeStamp;
        this.lowerCaseName = lowerCaseName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getLowerCaseName() {
        return lowerCaseName;
    }

    public void setLowerCaseName(String lowerCaseName) {
        this.lowerCaseName = lowerCaseName;
    }

    @Override
    public boolean isPerson() {
        return true;
    }

    public int getMonth(long date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        return calendar.get(Calendar.MONTH);
    }

    public int getDay(long date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}

