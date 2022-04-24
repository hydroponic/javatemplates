package com.company.pr14.controllers;

import com.company.pr14.domain.Manufacture;
import com.company.pr14.domain.Phone;
import com.company.pr14.repos.ManufactureRepo;
import com.company.pr14.repos.PhoneRepo;
import lombok.extern.slf4j.Slf4j;
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

@Controller
@Slf4j
public class ManufactureController {
    @Autowired
    private ManufactureRepo manufactureRepo;

    @GetMapping("/manufacture")  public String manufacture(@RequestParam(name="name", required=false, defaultValue = "World") String name, Map<String, Object> model) {
        List<Manufacture> manufactures = manufactureRepo.findByName("Улица Генерала Гавса","address");
        model.put("manufactures", manufactures);
        log.info("ManufactureController: works");
        return "manufacture";
    }
}
