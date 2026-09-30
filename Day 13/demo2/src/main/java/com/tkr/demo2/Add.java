package com.tkr.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Add {
 
    @GetMapping("/add")
    public String calculator() {
        return "add";
    }

    @PostMapping ("/add")
    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model) {
        int result = a + b;
        model.addAttribute("result", result);
        return "add";

    }
}
