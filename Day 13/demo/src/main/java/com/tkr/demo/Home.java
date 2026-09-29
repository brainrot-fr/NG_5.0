package com.tkr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Controller 

public class Home {

    public static void main(String[] args) {
		SpringApplication.run(Home.class, args);
	}


    @GetMapping("/home")
    public String home() {
        return "index";
    }
}
