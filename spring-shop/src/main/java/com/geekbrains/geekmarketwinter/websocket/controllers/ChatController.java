package com.geekbrains.geekmarketwinter.websocket.controllers;

import com.geekbrains.geekmarketwinter.websocket.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/chat/messages")
    public Message getMessages(Message message) throws InterruptedException {
//        Thread.sleep(100);
        System.out.println(message);
        return message;
    }
}
