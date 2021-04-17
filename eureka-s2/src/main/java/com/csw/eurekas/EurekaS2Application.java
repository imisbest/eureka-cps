package com.csw.eurekas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaS2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaS2Application.class, args);
    }

}
