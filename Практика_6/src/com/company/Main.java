package com.company;

public class Main {

    public static void main(String[] args) {
        BanFactory newOverBanFactory = new OverBanFactory();
        BanFactory newBasicBanFactory = new BasicBanFactory();

        Ban myLuxCar = newOverBanFactory.createBan();
        Ban myBasicCar = newBasicBanFactory.createBan();

        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
}
