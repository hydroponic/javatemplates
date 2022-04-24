package com.company.pr14.domain;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Slf4j
@EnableAspectJAutoProxy
@Table(name = "phone")
@Component
public class Phone {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @SequenceGenerator(name = "manufactures_seq", sequenceName =
            "manufactures_sequence", allocationSize = 1)

    private Integer id;
    private String name;
    private int creationYear;
    @ManyToOne
    @JoinColumn(name = "manufacture_id", referencedColumnName = "id")
    public Manufacture manufacture;

    public Phone() {
        log.info("Phone: default_constructor");
    }

    public Phone(String name, int creationYear, Manufacture manufacture) {
        this.name = name;
        this.creationYear = creationYear;
        this.manufacture = manufacture;
        log.info("Phone: data2_constructor");
    }

    public Manufacture getManufacture() {
        log.info("Phone: got manufacture");
        return manufacture;

    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
        log.info("Phone: manufacture was set");
    }

    public Integer getId() {
        log.info("Phone: got id");
        return id;

    }

    public void setId(Integer id) {
        this.id = id;
        log.info("Phone: id was set");
    }

    public String getName() {
        log.info("Phone: got name");
        return name;

    }

    public int getCreationYear() {
        log.info("Phone: got creationYear");
        return creationYear;
    }

    public void setName(String name) {
        this.name = name;
        log.info("Phone: name was set");
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
        log.info("Phone: creationYear was set");
    }

    public Phone(String name, int creationYear) {
        this.id=id;
        this.name=name;
        this.creationYear=creationYear;
        log.info("Phone: data_constructor");
    }
}