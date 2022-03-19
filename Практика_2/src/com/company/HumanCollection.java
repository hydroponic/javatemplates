package com.company;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class HumanCollection {
    public Stream<Human> humans() {
        return getUsers().stream();
    }
    public List<Human> getUsers() {
        return Arrays.asList(new Human(29 , "Игорь","Токач",LocalDate.now(),78), new Human(14 , "Алексей","Шевцов",LocalDate.now(),67),
                new Human(16 , "Виталий","Цаль",LocalDate.now(),54));
    }
    public static Predicate<Human> weighter() {
        return u ->u.getAge() < u.getWeight();
    }
}