package com.geekbrains.geekmarketwinter.websocket.controllers;

import com.geekbrains.geekmarketwinter.entites.Greeting;
import com.geekbrains.geekmarketwinter.entites.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ShopControllerWs {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return new Greeting(message.getName() + " добавлен в коризну!");
    }
}
