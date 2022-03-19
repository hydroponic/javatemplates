package com.company;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
       HumanCollection one = new HumanCollection();
        List<Human> humans=one.humans().filter(HumanCollection.weighter()).sorted(Comparator.comparing(Human::getFirstName).reversed()).collect(toList());
        int sum = humans.stream(). reduce(0,
                (x,y)-> {
                        return x + y.getWeight();
                },
                (x, y)->x+y);
        System.out.println("Список объектов, удовлетворяющих условию, отсортированный в обратном порядке по именам: ");
        for (int i=0;i<humans.size();i++)
            System.out.println(humans.get(i).getFirstName());
        System.out.println("общий вес: "+sum);
    }
}
