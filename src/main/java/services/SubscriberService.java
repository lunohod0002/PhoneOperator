package services;

import entities.Subscriber;

import java.util.List;

public interface SubscriberService {
    void register(Subscriber subscriber);
    void update(Subscriber subscriber);

}
