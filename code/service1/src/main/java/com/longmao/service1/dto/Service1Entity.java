package com.longmao.service1.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "service1")
public class Service1Entity {
    private int min;
    private int max;
    private int port;
}
