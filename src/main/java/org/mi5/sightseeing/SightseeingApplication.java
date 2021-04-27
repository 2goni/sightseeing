package org.mi5.sightseeing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SightseeingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SightseeingApplication.class, args);
    }

}
