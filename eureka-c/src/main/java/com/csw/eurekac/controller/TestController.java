package com.csw.eurekac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping("test")
    public String test(String name) {
        ServiceInstance choose = loadBalancerClient.choose("eureka-p");
        URI uri = choose.getUri();
        System.out.println(uri);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri + "/test/test?name=" + name, String.class);
    }
}
