package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity @Table(name = "tarrifs")
public class Tariffs extends BaseEntity {
    private String name;
    private int price;
    private String description;
    private int calls_number;
    private int internet_number;

    public Tariffs(String name, int price, String description, int calls_number, int internet_number) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calls_number = calls_number;
        this.internet_number = internet_number;
    }

    public Tariffs() {

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

    public int getInternet_number() {
        return internet_number;
    }

    public void setInternet_number(int internet_number) {
        this.internet_number = internet_number;
    }
}
