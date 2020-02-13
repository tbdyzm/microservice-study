package com.longmao.service2.proxy;

import com.longmao.service2.dto.Service1Entity;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "zuul-server", fallbackFactory = Service1ProxyImp.class)
@RibbonClient(name = "service1")
public interface Service1Proxy {
    @GetMapping("/service1/service1")
    Service1Entity getMinAndMax();
}
