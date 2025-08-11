package org.unc.app.pattern.factory;

public class Latte implements Coffee{
    @Override
    public String getDescripcion() {
        return "Latte";
    }
    @Override
    public double getCosto() {
        return 2.0;
    }
}
