package org.learning.petclinix.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.learning.petclinix.web","org.learning.petclinix.data"})
@SpringBootApplication
public class PetClinixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinixApplication.class, args);
    }

}
