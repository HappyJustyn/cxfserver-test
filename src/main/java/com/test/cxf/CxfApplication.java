package com.test.cxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
public class CxfApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxfApplication.class, args);
    }
}
