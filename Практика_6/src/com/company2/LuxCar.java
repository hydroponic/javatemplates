package com.company2;

public class LuxCar extends Car{
    public LuxCar(CarPartsFactory carPartsFactory){
        name = "Luxury Car";
        accessories.add(carPartsFactory.addCarSalon());
        accessories.add(carPartsFactory.addSteeringWheel());
        accessories.add(carPartsFactory.addGPS());
    }
}
