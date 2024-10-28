package org.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController
@Controller
public class MyController {
    @GetMapping("/")
    public String index() {
        //return "Greetings from Spring Boot!";
        return "index.html";
    }
}