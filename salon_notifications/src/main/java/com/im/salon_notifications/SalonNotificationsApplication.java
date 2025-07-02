package com.im.salon_notifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaServer
@EnableFeignClients
@SpringBootApplication
public class SalonNotificationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalonNotificationsApplication.class, args);
    }

}
