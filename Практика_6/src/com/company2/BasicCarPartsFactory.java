package com.company2;

class BasicCarPartsFactory implements CarPartsFactory{
    public CarSalon addCarSalon(){
        return new BasicCarSalon();
    }

    public SteeringWheel addSteeringWheel(){
        return new BasicSteeringWheel();
    }

    public GPS addGPS(){
        return null;
    }
}