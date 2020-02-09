package com.longmao.service2.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "service2")
public class Service2Entity {
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;
    private int port;
}
