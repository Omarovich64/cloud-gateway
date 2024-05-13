package com.example.apirest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-rest-1")
public class controller {
	
    @GetMapping("/hello")
    public String sayHello() {
        return "Application 1 : Hello World!";
    }

}
