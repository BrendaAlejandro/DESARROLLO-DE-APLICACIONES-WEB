package com.coudevi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hello-service")
public interface HelloClient {

    @GetMapping("/api/hello")
    String getHelloMessage();
}
