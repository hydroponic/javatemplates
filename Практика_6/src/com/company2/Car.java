package com.company2;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String name;
    List accessories = new ArrayList();

    public String toString(){
        return "Model car: " + name + "\n" + accessories;
    }
}
