package com.demoapplication.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class worldController {
    public worldController() {}

    @GetMapping({"/world"})
    public String world() {
        return "Hello World this is Mohit and this new springboot file!";
    }
}
