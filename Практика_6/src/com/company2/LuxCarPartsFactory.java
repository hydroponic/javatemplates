package com.company2;

public class LuxCarPartsFactory implements CarPartsFactory{

    public CarSalon addCarSalon(){
        return new LeatherCarSalon();
    }

    public SteeringWheel addSteeringWheel(){
        return new HeatedSteeringWheel();
    }

    public GPS addGPS(){
        return new CarGPS();
    }
}


