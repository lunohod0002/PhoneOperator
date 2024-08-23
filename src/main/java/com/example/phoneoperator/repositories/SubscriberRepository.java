package com.example.phoneoperator.repositories;

import com.example.phoneoperator.Dto.SubscriberDTO;
import com.example.phoneoperator.domain.Subscriber;
import org.springframework.stereotype.Repository;

@Repository

public interface SubscriberRepository {

    void addSubscriber(Subscriber subscriber);

    Subscriber findSubscriberById(int id);

}
