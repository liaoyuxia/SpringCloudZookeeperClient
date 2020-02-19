package com.example.springcloud.controller;

import com.example.springcloud.client.FeignConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    FeignConsumerClient feignConsumerClient;
    @RequestMapping("/test")
    public String test(){
         return feignConsumerClient.getTest();
    }
}
