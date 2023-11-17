package com.example.finanancialdashboard.controllers;

import com.example.finanancialdashboard.config.Routes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(path = {"index", "/", "dashboard"})
    public String dashboard(Model model) {
        model.addAttribute("name", "dashboard");
        return "dashboard";
    }

    @RequestMapping("about")
    public String about(Model model) {
        model.addAttribute("name", "about");
        return "about";
    }

    @RequestMapping("contact")
    public String contact(Model model) {
        model.addAttribute("name", "contact");
        return "contact";
    }

    @RequestMapping("*")
    public String any(Routes page, Model model) {
        model.addAttribute("name", "index");
        return "dashboard";
    }
}
