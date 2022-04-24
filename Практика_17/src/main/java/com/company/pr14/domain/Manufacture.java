package com.company.pr14.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Slf4j
@Table(name = "manufacture")
@Component
public class Manufacture {
    @Id
    @SequenceGenerator(name = "manufacture_seq", sequenceName =
            "manufactures_sequence", allocationSize = 1) @GeneratedValue(generator = "manufactures_seq", strategy =
            GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "manufacture")
    private Set<Phone> phones = new HashSet<>();
    public Manufacture() {
        log.info("Manufacture: default_constructor");
    }

    public Integer getId() {
        log.info("Manufacture: got id");
        return id;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
        log.info("Manufacture: phones list was set");
    }

    public Set<Phone> getPhones() {
        log.info("Manufacture: got phones list");
        return phones;
    }
    public void addPhones(Set<Phone> phones) {

        this.phones=phones;
    }
    public void add(Phone phone) {
        phone.setManufacture(this);
        this.phones.add(phone);
        log.info("Manufacture: phone added to phones list");
    }

    public void setId(Integer id) {
        this.id = id;
        log.info("Manufacture: id was set");
    }

    public String getName() {
        log.info("Manufacture: got name");
        return name;

    }

    public String getAddress() {
        log.info("Manufacture: got address");
        return address;
    }

    public void setName(String name) {

        this.name = name;
        log.info("Manufacture: name was set");
    }

    public void setAddress(String address) {
        this.address = address;
        log.info("Manufacture: address was set");
    }

    public Manufacture(String name, String address) {
        this.id=id;
        this.name=name;
        this.address=address;
        log.info("Manufacture: data_constructor");
    }
}