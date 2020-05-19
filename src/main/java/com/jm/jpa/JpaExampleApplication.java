package com.jm.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jm.jpa.controller","com.jm.jpa.api"})
public class JpaExampleApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JpaExampleApplication.class, args);
    }
}
