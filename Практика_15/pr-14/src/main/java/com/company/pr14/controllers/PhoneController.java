package com.company.pr14.controllers;

import com.company.pr14.domain.Phone;
import com.company.pr14.repos.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.lang.Integer.parseInt;

@Controller
public class PhoneController {
    @Autowired
    private PhoneRepo phoneRepo;

    @GetMapping("/phone")  public String phone(@RequestParam(name="name", required=false, defaultValue = "World") String name, Map<String, Object> model) {
        phoneRepo.save(new Phone("iphone8",2014));
        phoneRepo.save(new Phone("xiaomi MI9",2019));
        Iterable<Phone> phones = phoneRepo.findAll();
        model.put("phones", phones);
        return "phone";
    }
}
