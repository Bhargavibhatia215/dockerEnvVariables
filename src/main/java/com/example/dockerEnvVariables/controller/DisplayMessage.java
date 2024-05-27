package com.example.dockerEnvVariables.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayMessage {

    @Value("${message.value}")
    private String displayMessage;

    @Value("${message.value2}")
    private String displayMessageFromFile;

    @GetMapping("/message")
    public String displayMessage(){
        return displayMessage;
    }
    @GetMapping("/messageFromFile")
    public String displayMessageFromFile(){
        return displayMessageFromFile;
    }
}
