package com.example.phoneoperator.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity @Table(name = "subscriber")
public class Subscriber  extends BaseEntity{
    private String fio;
    private int age;
    private int debt;
    private int bonus_number;

    public Subscriber(String fio, int age, int debt, int bonus_number, Set<Services> services_number) {
        this.fio = fio;
        this.age = age;
        this.debt = debt;
        this.bonus_number = bonus_number;
    }

    protected Subscriber() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }


    public int getBonus_number() {
        return bonus_number;
    }

    public void setBonus_number(int bonus_number) {
        this.bonus_number = bonus_number;
    }


}
