package com.braincad.lesson2_7;

import java.util.Objects;

/**
 * Created by KrevSaa on 17.09.2016.
 * 2_7_1: Create classes:
 1) Base class Device(manufacturer(String), price(float), serialNumber(String));
 2) Subclasses Monitor(resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
 Add getters/setters and constructor to each class
   2_7_2:
 Override toString() method in each class
 In toString() method provide code which prints class name and fields values.
 Example:
 Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
 Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
    2_7_3:
 Override equals() method in each class
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
         return ("manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber= " + getSerialNumber());
    }

    @Override
    public boolean equals(Object o){
        if ( this == o ) return true;
        if ( o == null || this.getClass() != o.getClass()) return false;
        Device device = (Device) o ;
        if (this.manufacturer == device.manufacturer & this.price == device.price & this.serialNumber == device.serialNumber) return true;
        else return false;
    }
}

class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return ("manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber= " + getSerialNumber() +
                ", X = " + getResolutionX() + ", Y = " + getResolutionY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        if (this.getManufacturer() == monitor.getManufacturer() & this.getPrice() == monitor.getPrice() & this.getSerialNumber() == monitor.getSerialNumber() &
                this.getResolutionY() == monitor.getResolutionY() & this.getResolutionX() == monitor.getResolutionX())
            return true;
        else return false;
    }

}

class EthernetAdapter extends Device{
    private int spped;
    private String mac;

    public int getSpped() {
        return spped;
    }

    public void setSpped(int spped) {
        this.spped = spped;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString(){
        return ("manufacturer = " + getManufacturer() + ", price = " + getPrice() + ", serialNumber= " + getSerialNumber() +
                ", Speed = " + getSpped() + ", Mac = " + getMac());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) o;
        if (this.getManufacturer() == ethernetAdapter.getManufacturer() & this.getPrice() == ethernetAdapter.getPrice() & this.getSerialNumber() == ethernetAdapter.getSerialNumber() &
                this.getSpped() == ethernetAdapter.getSpped() & this.getMac() == ethernetAdapter.getMac())
            return true;
        else return false;
    }

}

class main{
    public static void main(String[] args) {
        EthernetAdapter ethernetAdapter = new EthernetAdapter();

    }
}
