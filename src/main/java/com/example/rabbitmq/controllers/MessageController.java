package com.example.rabbitmq.controllers;

import com.example.rabbitmq.classes.MyMessage;
import com.example.rabbitmq.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public void sendMessage(@RequestParam String exchange, @RequestParam String routingKey, @RequestBody MyMessage message) {
        messageService.sendMessage(exchange, routingKey, message);
    }
}