package com.moecodes.securenote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from the controller";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "My contacts are...";
    }
}
