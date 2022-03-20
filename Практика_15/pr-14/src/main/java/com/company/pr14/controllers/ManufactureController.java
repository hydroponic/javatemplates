package com.company.pr14.controllers;

import com.company.pr14.domain.Manufacture;
import com.company.pr14.domain.Phone;
import com.company.pr14.repos.ManufactureRepo;
import com.company.pr14.repos.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class ManufactureController {
    @Autowired
    private ManufactureRepo manufactureRepo;

    @GetMapping("/manufacture")  public String manufacture(@RequestParam(name="name", required=false, defaultValue = "World") String name, Map<String, Object> model) {
        manufactureRepo.save(new Manufacture("фабрика1","Улица Генерала Гавса"));
        manufactureRepo.save(new Manufacture("фабрика2","Улица Пушкина"));
        Iterable<Manufacture> manufactures = manufactureRepo.findAll();
        model.put("manufactures", manufactures);
        return "manufacture";
    }

}
