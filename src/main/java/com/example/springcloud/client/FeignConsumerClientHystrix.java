package com.example.springcloud.client;

import org.springframework.stereotype.Component;

@Component
public class FeignConsumerClientHystrix implements FeignConsumerClient{

    @Override
    public String getTest() {
        return "error";
    }
}
