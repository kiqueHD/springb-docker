package com.example.springb_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @GetMapping("/hello")
    public String helloDocker() {
        return "Hello Docker!";
    }
}
