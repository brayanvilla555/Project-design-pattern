package org.unc.app.pattern.decorator;

import org.unc.app.pattern.factory.Coffee;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) { super(coffee); }

    @Override
    public String getDescripcion() {
        return wrappedCoffee.getDescripcion() + ", Cream";
    }

    @Override
    public double getCosto() {
        return wrappedCoffee.getCosto() + 0.6;
    }
}