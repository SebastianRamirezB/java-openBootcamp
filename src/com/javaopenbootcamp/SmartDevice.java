package com.javaopenbootcamp;

public class SmartDevice {

    String trademark;
    String model;
    String processorModel;
    String screenType;
    double screenSize;
    int batteryCapacity;
    boolean withCamera;


    public SmartDevice(){}

    public SmartDevice(String trademark, String model, String processorModel, String screenType, double screenSize, int batteryCapacity, boolean withCamera){
        this.trademark = trademark;
        this.model = model;
        this.processorModel = processorModel;
        this.screenType = screenType;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.withCamera = withCamera;
    }


}
