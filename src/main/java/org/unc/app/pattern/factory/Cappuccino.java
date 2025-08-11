package org.unc.app.pattern.factory;

public class Cappuccino implements Coffee{
    @Override
    public String getDescripcion() {
        return "Cappuccino";
    }

    @Override
    public double getCosto() {
        return 3.0;
    }
}
