package com.order.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping("/message")
    public String orderMessage(){
        return "Message from Order Service HI change from Branch.";
    }

}
