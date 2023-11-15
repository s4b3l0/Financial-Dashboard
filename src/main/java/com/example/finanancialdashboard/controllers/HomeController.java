package com.example.finanancialdashboard.controllers;


import com.example.finanancialdashboard.config.Routes;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.RouteMatcher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(path ={"index", "/", "dashboard"})
    public String dashboard(@PathParam("page") Routes page, Model model) {
        return "dashboard";
    }

    @RequestMapping("about")
    public String about(@PathParam("page") Routes page, Model model) {
        return "about";
    }

    @RequestMapping("contact")
    public String contact(@PathParam("page") Routes page, Model model) {
        return "contact";
    }

    @RequestMapping("*")
    public String any(@PathParam("page") Routes page, Model model) {
        return "dashboard";
    }
}
