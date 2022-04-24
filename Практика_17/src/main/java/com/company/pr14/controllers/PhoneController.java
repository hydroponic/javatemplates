package com.company.pr14.controllers;

import com.company.pr14.domain.Manufacture;
import com.company.pr14.domain.Phone;
import com.company.pr14.repos.PhoneRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.lang.Integer.parseInt;

@Controller
@Slf4j
public class PhoneController {
    @Autowired
    private PhoneRepo phoneRepo;

    @GetMapping("/phone")  public String phone(@RequestParam(name="name", required=false, defaultValue = "World") String name, Map<String, Object> model) {
        Manufacture m = new Manufacture("228", "Дом калатушкина");
        List<Phone> phones = phoneRepo.findByName("2014","creationYear");
        model.put("phones", phones);
        log.info("PhoneController: works, main");
        return "phone";
    }
}
