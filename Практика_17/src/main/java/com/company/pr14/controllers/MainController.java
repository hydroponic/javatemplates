package com.company.pr14.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class MainController {
    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name",name);
        log.info("home controller: works");
        return "home";
    }
}
