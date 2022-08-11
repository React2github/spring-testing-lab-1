package com.example.Spring.lab1;

import org.springframework.web.bind.annotation.*;

//The controller is where we will define which methods a client request is routed to and what should be sent back as a response. Spring provides several annotations to make it easy to manage requests, responses, and client parameters.

@RestController //The @RestController combines the following annotations: @Controller: Indicates to Spring that the class represents a controller.@ResponseBody: Configures Spring to return JSON response from controller methods instead of view templates which is the default.
public class StringController {

   String example = "cat";

    @GetMapping("/reverse")
    public String createReverseString(String example) {
    StringBuilder stringBuilder = new StringBuilder(example);
    return stringBuilder.reverse().toString();
    }
}



