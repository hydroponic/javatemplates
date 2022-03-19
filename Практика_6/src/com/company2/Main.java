package com.company2;

public class Main {

        public static void main(String[] args) {
                CarPartsFactory myLuxFactory = new LuxCarPartsFactory();
                CarPartsFactory myBasicFactory = new BasicCarPartsFactory();

                Car myLuxCar = new LuxCar(myLuxFactory);
                Car myBasicCar = new BasicCar(myBasicFactory);
                System.out.println(myLuxCar);
                System.out.println(myBasicCar);
        }
}
