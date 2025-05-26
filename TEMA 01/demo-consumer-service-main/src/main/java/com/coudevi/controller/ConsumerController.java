package com.coudevi.controller;

import com.coudevi.client.HelloClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private final HelloClient helloClient;


    public ConsumerController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @GetMapping("/api/consumer-hello")
    public String consumerHello(){
        return "Soy el MS de Consumer " + helloClient.getHelloMessage();
    }
}
