package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    class DemoAppController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }

        @GetMapping("/version")
        public String version() {
            return "0.0.1";
        }
    }
}
