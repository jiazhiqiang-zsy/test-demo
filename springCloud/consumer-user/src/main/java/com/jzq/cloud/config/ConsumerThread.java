package com.jzq.cloud.config;

import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ConsumerThread extends Thread{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":'Thread is run'");
        }
    }
}
