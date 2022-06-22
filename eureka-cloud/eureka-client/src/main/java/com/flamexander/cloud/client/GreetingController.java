package com.flamexander.cloud.client;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/greeting1")
    String greeting1();

    @RequestMapping("/greeting-example")
    String greetingExample();

    @RequestMapping("/get-obj")
    Cat getCat();
}
