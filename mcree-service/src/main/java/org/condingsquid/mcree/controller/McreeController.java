package org.condingsquid.mcree.controller;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McreeController {

    private final EurekaClient eurekaClient;

    public McreeController(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    @GetMapping("/service/{applicationName}")
    public Application getServiceInfo(@PathVariable(value = "applicationName") String applicationName) {
        return eurekaClient.getApplication(applicationName);
    }

    @GetMapping("/health-check")
    public String healthCheck() {
        return "ok";
    }
}
