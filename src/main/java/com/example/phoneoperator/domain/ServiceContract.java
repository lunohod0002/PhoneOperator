package com.example.phoneoperator.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "service_contract")

public class ServiceContract extends BaseEntity {
    private Subscriber subscriber;
    private Services service;
    private String date;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    public ServiceContract(Subscriber subscriber, Services service, String date, StatusEnum status) {
        this.subscriber = subscriber;
        this.service = service;
        this.date=date;
        this.status=status;
    }

    protected ServiceContract() {}

    @ManyToOne
    @JoinColumn(name = "subscriber_id")
    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @ManyToOne
    @JoinColumn(name = "course_id")
    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
