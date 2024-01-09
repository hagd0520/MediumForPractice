package com.ll.mediumforpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MediumForPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediumForPracticeApplication.class, args);
    }

}
