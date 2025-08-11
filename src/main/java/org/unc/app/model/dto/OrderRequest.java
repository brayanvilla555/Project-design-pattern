package org.unc.app.model.dto;

import java.util.List;

public class OrderRequest {
    private String coffeeType;
    private List<String> extras;

    public OrderRequest() {}

    public OrderRequest(String coffeeType, List<String> extras) {
        this.coffeeType = coffeeType;
        this.extras = extras;
    }

    public String getCoffeeType() {
        return coffeeType;
    }
    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }
    public List<String> getExtras() {
        return extras;
    }
    public void setExtras(List<String> extras) {
        this.extras = extras;
    }
}