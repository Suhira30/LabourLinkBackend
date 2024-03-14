package com.intelli5.labourlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.intelli5.labourlink")
public class LabourLinkBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabourLinkBackendApplication.class, args);
    }

}
