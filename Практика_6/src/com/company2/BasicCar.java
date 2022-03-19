package com.company2;

public class BasicCar extends Car{
    public BasicCar(CarPartsFactory carPartsFactory){
        name = "Basic Car";
        accessories.add(carPartsFactory.addCarSalon());
        accessories.add(carPartsFactory.addSteeringWheel());
    }
}
