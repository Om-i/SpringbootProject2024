package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);

        System.out.println("Hello, world!");
        /*
         * Set port programmatically
         */
//        SpringApplication app = new SpringApplication(Main.class);
//        app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
//        app.run(args);

    }
}