package org.unc.app.pattern.builder;

import org.unc.app.pattern.decorator.ChocolateDecorator;
import org.unc.app.pattern.decorator.CreamDecorator;
import org.unc.app.pattern.decorator.MilkDecorator;
import org.unc.app.pattern.factory.Coffee;
import org.unc.app.pattern.factory.CoffeeFactory;

public class CoffeeBuilder  {
    private Coffee coffee;

    public CoffeeBuilder  withBase(String coffeeType) {
        this.coffee = CoffeeFactory.createCoffee(coffeeType);
        return this;
    }

    public CoffeeBuilder  addMilk() {
        this.coffee = new MilkDecorator(this.coffee);
        return this;
    }

    public CoffeeBuilder  addChocolate() {
        this.coffee = new ChocolateDecorator(this.coffee);
        return this;
    }

    public CoffeeBuilder  addCream() {
        this.coffee = new CreamDecorator(this.coffee);
        return this;
    }

    public Coffee build() {
        if (coffee == null) throw new IllegalStateException("Base coffee not set");
        return coffee;
    }
}