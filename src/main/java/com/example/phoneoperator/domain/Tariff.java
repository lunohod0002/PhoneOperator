package com.example.phoneoperator.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity @Table(name = "tarrifs")
public class Tariff extends BaseEntity {
    private String name;
    private int price;
    private String description;
    private int calls_number;
    private int gigabytes_numbers;

    public Tariff(String name, int price, String description, int calls_number, int gigabytes_numbers) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calls_number = calls_number;
        this.gigabytes_numbers = gigabytes_numbers;
    }

    protected Tariff() {

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

    public int getCalls_number() {
        return calls_number;
    }

    public void setCalls_number(int calls_number) {
        this.calls_number = calls_number;
    }

    public int getGigabytes_numbers() {
        return gigabytes_numbers;
    }

    public void setGigabytes_numbers(int gigabytes_numbers) {
        this.gigabytes_numbers = gigabytes_numbers;
    }
}
