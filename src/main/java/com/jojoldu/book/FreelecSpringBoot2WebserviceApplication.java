package com.jojoldu.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FreelecSpringBoot2WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreelecSpringBoot2WebserviceApplication.class, args);
    }

}
