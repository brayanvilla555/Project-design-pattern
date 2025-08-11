package org.unc.app.pattern.decorator;

import org.unc.app.pattern.factory.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescripcion() {
        return wrappedCoffee.getDescripcion()+ ", con leche";
    }

    @Override
    public double getCosto() {
        return wrappedCoffee.getCosto() + 0.5;
    }
}
