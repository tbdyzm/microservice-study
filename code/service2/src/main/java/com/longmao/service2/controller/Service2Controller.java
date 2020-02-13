package com.longmao.service2.controller;

import com.longmao.service2.dto.Service1Entity;
import com.longmao.service2.dto.Service2Entity;
import com.longmao.service2.proxy.Service1Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class Service2Controller {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Service2Entity service2Entity;
    @Autowired
    private Service1Proxy service1Proxy;

    @GetMapping("/service2")
    public Map<String, Object> rangeFromMinToMax(){
        Map<String, Object> response = new HashMap<>();
        Service1Entity service1Entity = service1Proxy.getMinAndMax();
        if (service2Entity.getFirst() > service1Entity.getMin() && service2Entity.getFirst() < service1Entity.getMax())
            response.put("first", service2Entity.getFirst());
        if (service2Entity.getSecond() > service1Entity.getMin() && service2Entity.getSecond() < service1Entity.getMax())
            response.put("second", service2Entity.getSecond());
        if (service2Entity.getThird() > service1Entity.getMin() && service2Entity.getThird() < service1Entity.getMax())
            response.put("third", service2Entity.getThird());
        if (service2Entity.getFourth() > service1Entity.getMin() && service2Entity.getFourth() < service1Entity.getMax())
            response.put("fourth", service2Entity.getFourth());
        if (service2Entity.getFifth() > service1Entity.getMin() && service2Entity.getFifth() < service1Entity.getMax())
            response.put("fifth", service2Entity.getFifth());
        response.put("port", service1Entity.getPort());
        logger.info("{}", response);
        return response;
    }
}
