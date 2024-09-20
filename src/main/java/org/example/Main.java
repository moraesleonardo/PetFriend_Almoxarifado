package org.example;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(
        basePackages = {"org.example.almoxarifado"}
)
@EnableRabbit
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
