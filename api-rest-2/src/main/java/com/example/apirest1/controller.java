package com.example.apirest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-rest-2")
public class controller {
	
    @GetMapping("/hello")
    public String sayHello() {
        return "Application 2 : Hello World!";
    }

}
