package com.mxln.springcloudalibabanacos9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudalibabaNacos9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudalibabaNacos9001Application.class, args);
    }

}
