package edu.mum.cs.cs425.demos.elibrarydemocrudweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class HomeController {

    @GetMapping(value = {"/", "/elibrary", "/home", "/elibrary/home"})
    public String home() {
        return "home/index";
    }

}
