package org.unc.app.pattern.factory;

public class CoffeeFactory {
    public static Coffee createCoffee(String tipo){
        if(tipo == null) throw new IllegalArgumentException("Tipo de Café no especificado");
        String tipoCafe = tipo.toLowerCase().trim();
        return switch(tipoCafe){
            case "latte" -> new Latte();
            case "espresso" -> new Espresso();
            case "cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Tipo de Café no soportado: " + tipoCafe);
        };
    }
}
