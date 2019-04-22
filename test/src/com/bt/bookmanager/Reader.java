package com.bt.bookmanager;

public class Reader {
    private static int id = 10000;
    private int readerID;
    private String readerName;
    private String address;
    private double phoneNumber;

    public Reader( String readerName, String address, double phoneNumber) {
        this.readerID = id++;
        this.readerName = readerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Reader(){
        this.readerID = id++;
        this.readerName = "";
        this.address = "";
        this.phoneNumber = 0;
    }

    public int getReaderID() {
        return readerID;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
