package com.jzq.cloud.controller;

import com.jzq.cloud.config.ConsumerThread;
import com.jzq.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    UserService userService;

    @GetMapping("/buy")
    public String buyTicket(String name){
       String a = userService.getTicket();
        return name+"买了一张"+a;
    }



    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new ConsumerThread().start();
        }
    }
}
