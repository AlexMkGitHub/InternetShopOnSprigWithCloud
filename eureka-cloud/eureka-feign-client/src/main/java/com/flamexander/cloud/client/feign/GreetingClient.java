package com.flamexander.cloud.client.feign;

import com.flamexander.cloud.client.Cat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//geek-spring-cloud-eureka-feign-client
@FeignClient("geek-spring-cloud-eureka-client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/greeting1")
    String greeting1();

    @RequestMapping("/greeting-example")
    String greetingExample();

    @RequestMapping("/get-obj")
    Cat getCat();
}
