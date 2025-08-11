package org.unc.app.service;

import org.unc.app.model.dto.OrderRequest;
import org.unc.app.model.entity.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(OrderRequest request);
    List<Order> getAllOrders();
}
