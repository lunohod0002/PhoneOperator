package com.example.phoneoperator.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Set;
@Entity @Table(name = "services")
public class Services extends BaseEntity {
    private String name;
    private int price;
    private String description;
    private boolean onStock;

    public Services(String name, int price, String description, Set<ServiceContract> serviceContractSet, boolean onStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.onStock= onStock;
    }

    protected Services() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOnStock() {
        return onStock;
    }

    public void setOnStock(boolean onStock) {
        this.onStock = onStock;
    }
}
