package org.condingsquid.mcree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class McreeApplication {

    public static void main(String... args) {
        SpringApplication.run(McreeApplication.class, args);
    }
}
