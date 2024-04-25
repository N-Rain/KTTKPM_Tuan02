package com.iuh.orderservice.service;

import com.iuh.orderservice.models.Order;
import com.iuh.orderservice.repositories.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getListUser(){
        return  orderRepository.findAll();
    }

    public Order getUserById(long id){
        return orderRepository.findById(id).get();
    }
}
