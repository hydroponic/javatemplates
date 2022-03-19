package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Ban {
        String name;
        int length;

        public String toString(){
            return "Ban info: " + name + "\nlength: " + length+"h";
        }
}
