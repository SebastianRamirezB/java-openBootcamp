package com.javaopenbootcamp;

public class Main {
    public static void main(String[] args) {


        SmartPhone realme = new SmartPhone(
                "Realme",
                "GT Master",
                "Snapdragon 778G 5G",
                "Super AMOLED",
                6.43,
                4300,
                true,
                true
                );

        SmartWatch huawei = new SmartWatch(
                "Huawei",
                "Fit",
                "DK3. 5 + ST",
                "Amoled",
                1.64,
                180,
                false,
                "pink"
        );


        System.out.println(realme.toString());
        System.out.println(huawei.toString());


    }
}
