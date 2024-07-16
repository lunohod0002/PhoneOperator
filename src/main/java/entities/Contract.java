package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity @Table(name = "contract")
public class Contract extends BaseEntity {
    private String date;

    private Subscriber subscriber;
    private Phones phones;
    private Tariffs tarrif;


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
    @ManyToOne
    @JoinColumn(name = "phone_id")
    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }
    @ManyToOne
    @JoinColumn(name = "tarrif_id")
    public Tariffs getTarrif() {
        return tarrif;
    }

    public void setTarrif(Tariffs tarrif) {
        this.tarrif = tarrif;
    }
}
