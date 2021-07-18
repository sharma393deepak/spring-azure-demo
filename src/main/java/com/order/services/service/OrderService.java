package com.order.services.service;

import com.order.services.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public String placeOrder(){
        return "success";
    }
}
