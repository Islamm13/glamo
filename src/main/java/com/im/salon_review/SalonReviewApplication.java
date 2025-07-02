package com.im.salon_review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SalonReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalonReviewApplication.class, args);
    }

}
