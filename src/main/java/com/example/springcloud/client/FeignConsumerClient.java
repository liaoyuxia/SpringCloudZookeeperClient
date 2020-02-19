package com.example.springcloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value="springcloud-zookeeper",fallback=FeignConsumerClientHystrix.class)
public interface FeignConsumerClient {
    @RequestMapping(value = "/test")
    public String getTest();
}
