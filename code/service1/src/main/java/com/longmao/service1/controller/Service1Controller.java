package com.longmao.service1.controller;

import com.longmao.service1.dto.Service1Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@EnableDiscoveryClient
public class Service1Controller {
    @Autowired
    private Environment environment;
    @Autowired
    Service1Entity service1Entity;

    @GetMapping("/service1")
    public Service1Entity getMinAndMax(){
        service1Entity.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return service1Entity;
    }
}
