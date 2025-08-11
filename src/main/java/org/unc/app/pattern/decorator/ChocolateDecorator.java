package org.unc.app.pattern.decorator;

import org.unc.app.pattern.factory.Coffee;

public class ChocolateDecorator extends CoffeeDecorator{
    public ChocolateDecorator(Coffee wrappedCoffee) {
        super(wrappedCoffee);
    }

    @Override
    public String getDescripcion() {
        return wrappedCoffee.getDescripcion() + ", con chocolate";
    }

    @Override
    public double getCosto() {
        return wrappedCoffee.getCosto() + 1.0;
    }
}
