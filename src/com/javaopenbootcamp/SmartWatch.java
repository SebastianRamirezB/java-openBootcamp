package com.javaopenbootcamp;

public class SmartWatch extends SmartDevice {

    String strapColor;

    public SmartWatch(String trademark, String model, String processorModel, String screenType, double screenSize, int batteryCapacity, boolean withCamera, String strapColor) {
        super(trademark, model, processorModel, screenType, screenSize, batteryCapacity, withCamera);
        this.strapColor = strapColor;
    }


    @Override
    public String toString() {
        return "SmartWatch{" +
                "strapColor='" + strapColor + '\'' +
                ", trademark='" + trademark + '\'' +
                ", model='" + model + '\'' +
                ", processorModel='" + processorModel + '\'' +
                ", screenType='" + screenType + '\'' +
                ", screenSize=" + screenSize +
                ", batteryCapacity=" + batteryCapacity +
                ", withCamera=" + withCamera +
                '}';
    }
}
