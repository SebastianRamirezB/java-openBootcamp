package com.javaopenbootcamp;

public class SmartPhone extends SmartDevice {

    boolean isDualSim;

    public SmartPhone(String trademark, String model, String processorModel, String screenType, double screenSize, int batteryCapacity, boolean withCamera, boolean isDualSim) {
        super(trademark, model, processorModel, screenType, screenSize, batteryCapacity, withCamera);
        this.isDualSim = isDualSim;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "isDualSim=" + isDualSim +
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
