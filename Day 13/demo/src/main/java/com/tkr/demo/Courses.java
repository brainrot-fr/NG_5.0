package com.tkr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller 

public class Courses {
@GetMapping("/hello")
    public String hello() {
        return "index";
    }
}