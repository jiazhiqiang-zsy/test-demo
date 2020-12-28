package com.jzq.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderAlibabaTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAlibabaTicketApplication.class, args);
    }

}
