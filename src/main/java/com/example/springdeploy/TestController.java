package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${app.message}")
    String message;
    @GetMapping("/testcontroller1")
    public String TestBookController(){
        System.out.println(message);
        return "Test Controller Spring Rest " + message;
    }
    @GetMapping("/testcontroller2")
    public String TestBootstrap(){
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Test Controller Spring Rest2</title>
                  </head>
                  <body>
                    <h1>Test Controller Spring Rest2</h1>
                  </body>
                </html>
                """;
    }
}
