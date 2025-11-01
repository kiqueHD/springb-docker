package com.example.springb_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
    public class mensaje {
        private String message;

        public mensaje(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
    }
    @GetMapping("/hello")
    public mensaje helloDocker() {
        return new mensaje("Hello Docker devolviendo un json");
    }
}
