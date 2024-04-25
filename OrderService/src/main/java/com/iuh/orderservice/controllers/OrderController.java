package com.iuh.orderservice.controllers;

import com.iuh.orderservice.models.Order;
import com.iuh.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    List<Order> getListUser(){
        return  orderService.getListUser();
    }

    @GetMapping("/{id}")
    Order getUserById(@PathVariable long id){
        return orderService.getUserById(id);
    }
}
