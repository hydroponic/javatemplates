package com.company;

import java.time.LocalDate;

public class Human {
    private int age, weight;
    private String firstName, lastName;
    private LocalDate birthDate;
    Human (int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age=age;this.firstName=firstName;this.lastName=lastName;this.birthDate=birthDate;this.weight=weight;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getAge() {
        return this.age;
    }
    public String getFirstName() {
        return this.firstName;
    }
}
