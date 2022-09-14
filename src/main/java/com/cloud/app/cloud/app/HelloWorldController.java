package com.cloud.app.cloud.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    String helloWorld(){
        return "Hello World";
    }
}
