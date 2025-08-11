package org.unc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.unc.app.model.dto.OrderRequest;
import org.unc.app.model.entity.Order;
import org.unc.app.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest request) {
        Order saved = service.createOrder(request);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders().stream()
                .map(e -> new Order(e.getId(), e.getDescription(), e.getTotalCost()))
                .toList();
    }
}