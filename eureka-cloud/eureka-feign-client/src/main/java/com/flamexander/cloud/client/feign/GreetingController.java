package com.flamexander.cloud.client.feign;

import com.flamexander.cloud.client.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    private GreetingClient greetingClient;

    @Autowired
    public void setGreetingClient(GreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        String answer = greetingClient.greeting();
//        String answer1 = greetingClient.greeting1();
//        System.out.println("Answer: " + answer);
        String result = answer + " and eureka-feign-client";
        model.addAttribute("greeting", result);
//        model.addAttribute("greeting1", answer1);
        return "greeting-view";
    }

    @RequestMapping("/get-greeting-example")
    public String greetingExample(Model model) {
        String answer = greetingClient.greetingExample();
//        String answer1 = greetingClient.greeting1();
//        System.out.println("Answer: " + answer);
        String result = answer + " and work!";
        model.addAttribute("greeting", result);
//        model.addAttribute("greeting1", answer1);
        return "greeting-view";
    }

    @RequestMapping("/get-obj")
    public String getCat(Model model) {
        Cat cat = greetingClient.getCat();
//        String answer1 = greetingClient.greeting1();
//        System.out.println("Answer: " + answer);
        model.addAttribute("cat", cat);
//        model.addAttribute("greeting1", answer1);
        return "greeting-obj";
    }
}
