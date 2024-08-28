package com.example.E_commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/CustomerOrder")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public CustomerOrder createOrder(@RequestBody CustomerOrder order) {
        return orderRepository.save(order);
    }
}
