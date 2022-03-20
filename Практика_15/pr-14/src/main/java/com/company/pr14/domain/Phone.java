package com.company.pr14.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private int creationYear;

    public Phone() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public Phone(String name, int creationYear) {
        this.id=id;
        this.name=name;
        this.creationYear=creationYear;
    }
}