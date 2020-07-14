package com.liuyuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer1 {

    public static void main(String[] args) {
        System.out.println("注册中心1111启动了");
        SpringApplication.run(StartEurekaServer1.class);
    }
}
