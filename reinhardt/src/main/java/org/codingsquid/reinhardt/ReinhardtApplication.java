package org.codingsquid.reinhardt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ReinhardtApplication {

    public static void main(String... args) {
        SpringApplication.run(ReinhardtApplication.class, args);
    }
}
