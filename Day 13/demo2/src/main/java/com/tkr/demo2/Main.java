package com.tkr.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

@Controller 
public class Main {

    @GetMapping("/")
    public String home(Model model) {
        String friend1 = "Adarsh";
        String friend2 = "Karthik";
        String friend3 = "Bharat";

        model.addAttribute("one", friend1);
        model.addAttribute("two", friend2);
        model.addAttribute("three", friend3);

        return "index";
    }


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    // @GetMapping("/add")
    // public static String calculator() {
    //     return "add";
    // }

    // @PostMapping ("/add")
    // public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model) {
    //     int result = a + b;
    //     model.addAttribute("result", result);
    //     return "add";

    // }
    
}
