package com.order.services.controller;

import com.order.services.entity.OrderEntity;
import com.order.services.service.OrderService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/bookOrder")
    public Response placeOrder(){
        orderService.placeOrder();
    return new Response();
    }

    @GetMapping("/getOrder")
    public String getOrder(){
        return "welcome to order micro service in azure cloud platform to book order";
    }

}
