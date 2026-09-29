package com.tkr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller 
public class Admission {
    @GetMapping("/admission")
    public String admission() {
        return "admission";
    }
}