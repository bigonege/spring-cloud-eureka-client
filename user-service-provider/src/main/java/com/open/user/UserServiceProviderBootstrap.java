package com.open.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈〉
 *
 * @Package com.open.user
 * @ClassName UserServiceProviderBootstrap
 * @Author wangky
 * @Create 2018/4/14 22:54
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServiceProviderBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderBootstrap.class,args);
    }
}