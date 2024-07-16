package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fee")

public class ServiceContract extends BaseEntity {

    Subscriber subscriber;


    Services course;


    @ManyToOne
    @JoinColumn(name = "subscriber_id")
    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setStudent(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    @ManyToOne
    @JoinColumn(name = "service_id")
    public Services getCourse() {
        return course;
    }

    public void setCourse(Services course) {
        this.course = course;
    }
}
