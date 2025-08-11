package org.unc.app.pattern.builder;

import org.unc.app.model.entity.Order;
import org.unc.app.pattern.factory.Coffee;

public class OrderBuilder {
    private String description;
    private double totalCost;

    public OrderBuilder description(String description) {
        this.description = description;
        return this;
    }

    public OrderBuilder totalCosto(double totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    public Order build() {
        if (description == null || description.isEmpty()) {
            throw new IllegalStateException("Order must have a description");
        }
        return new Order(description, totalCost);
    }
}