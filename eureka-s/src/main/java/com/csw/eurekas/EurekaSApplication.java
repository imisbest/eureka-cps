package com.csw.eurekas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSApplication.class, args);
    }

}
