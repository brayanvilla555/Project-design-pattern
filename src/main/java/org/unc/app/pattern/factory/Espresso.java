package org.unc.app.pattern.factory;

public class Espresso implements Coffee{
    @Override
    public String getDescripcion() {
        return "Espresso";
    }
    @Override
    public double getCosto() {
        return 1.5;
    }
}
