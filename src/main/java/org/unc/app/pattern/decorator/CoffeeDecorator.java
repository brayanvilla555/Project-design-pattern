package org.unc.app.pattern.decorator;

import org.unc.app.pattern.factory.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee wrappedCoffee){
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public String getDescripcion() {
        return wrappedCoffee.getDescripcion();
    }

    @Override
    public double getCosto() {
        return wrappedCoffee.getCosto();
    }
}
