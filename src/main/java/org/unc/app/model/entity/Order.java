package org.unc.app.model.entity;

import jakarta.persistence.*;
import org.unc.app.pattern.builder.OrderBuilder;

@Entity
@Table(name = "coffee_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double totalCost;

    public Order() {}

    public Order(Long id, String description, double totalCost) {
        this.id = id;
        this.description = description;
        this.totalCost = totalCost;
    }

    public Order(String description, double totalCost) {
        this.description = description;
        this.totalCost = totalCost;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}