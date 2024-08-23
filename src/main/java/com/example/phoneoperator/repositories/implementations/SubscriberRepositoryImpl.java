package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.Dto.ContractDto;
import com.example.phoneoperator.Dto.SubscriberDTO;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.domain.Subscriber;
import com.example.phoneoperator.repositories.GenericRepository;
import com.example.phoneoperator.repositories.SubscriberRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class SubscriberRepositoryImpl extends GenericRepository<Subscriber,Long> implements SubscriberRepository {
    public SubscriberRepositoryImpl() {
        super(Subscriber.class);
    }

    @Autowired
    EntityManager entityManager;
    @Override
    public void addSubscriber(Subscriber subscriber) {

    }

    @Override
    public Subscriber findSubscriberById(int id) {
        return entityManager.createQuery("SELECT sb FROM Subscriber sb WHERE sb.id = :id", Subscriber.class)
                .setParameter("id", id)
                .getSingleResult();
    }

/**/
}
