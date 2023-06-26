package com.maps.maps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mapsController {
    @GetMapping("/showMap")
        public String index() {
            return "index";
    }
}   
