package com.example.phoneoperator.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "contract")
public class Contract extends BaseEntity {
    private String date;
    private int minutes_remain;
    private int gigabytes_remain;

    private Subscriber subscriber;
    private Phone phones;
    private Tariff tarrif;

    public Contract(String date, int minutes_remain, int gigabytes_remain, Subscriber subscriber, Phone phones, Tariff tarrif) {
        this.date = date;
        this.minutes_remain = minutes_remain;
        this.gigabytes_remain = gigabytes_remain;
        this.subscriber = subscriber;
        this.phones = phones;
        this.tarrif = tarrif;
    }

    protected Contract() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "subscriber_id")
    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @OneToOne
    @JoinColumn(name = "phone_id")
    public Phone getPhones() {
        return phones;
    }

    public void setPhones(Phone phones) {
        this.phones = phones;
    }

    @OneToOne
    @JoinColumn(name = "tarrif_id")
    public Tariff getTarrif() {
        return tarrif;
    }

    public void setTarrif(Tariff tarrif) {
        this.tarrif = tarrif;
    }

    public int getMinutes_remain() {
        return minutes_remain;
    }

    public void setMinutes_remain(int minutes_remain) {
        this.minutes_remain = minutes_remain;
    }

    public int getGigabytes_remain() {
        return gigabytes_remain;
    }

    public void setGigabytes_remain(int gigabytes_remain) {
        this.gigabytes_remain = gigabytes_remain;
    }
}
