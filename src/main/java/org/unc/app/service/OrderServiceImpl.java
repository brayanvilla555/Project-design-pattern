package org.unc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unc.app.model.dto.OrderRequest;
import org.unc.app.model.entity.Order;
import org.unc.app.pattern.builder.CoffeeBuilder;
import org.unc.app.pattern.factory.Coffee;
import org.unc.app.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional
    public Order createOrder(OrderRequest request) {

        CoffeeBuilder  builder = new CoffeeBuilder()
                .withBase(request.getCoffeeType());

        List<String> extras = request.getExtras();

        if (extras != null) {
            for (String extra : extras) {
                if (extra == null) continue;
                switch (extra.toLowerCase().trim()) {
                    case "milk" -> builder.addMilk();
                    case "chocolate" -> builder.addChocolate();
                    case "cream" -> builder.addCream();
                    default -> {
                        throw new IllegalArgumentException("Invalid extra: " + extra);
                    }
                }
            }
        }

        Coffee finalCoffee = builder.build();

        Order orden = Order.builder()
                .description(finalCoffee.getDescripcion())
                .totalCosto(finalCoffee.getCosto())
                .build();

        return repository.save(orden);
    }

    @Transactional( readOnly = true)
    public List<Order> getAllOrders() {
        return (List<Order>) repository.findAll();
    }
}
