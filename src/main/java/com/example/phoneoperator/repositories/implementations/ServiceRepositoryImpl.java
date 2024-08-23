package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.domain.Services;
import com.example.phoneoperator.repositories.ServiceRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ServiceRepositoryImpl implements ServiceRepository {
    @Autowired
    EntityManager entityManager;

    @Override
    public Services findServiceByName(String name) {
        return entityManager.createQuery("SELECT sv FROM Services sv WHERE sv.name = :name", Services.class)
                .setParameter("name", name)
                .getSingleResult();    }

    @Override
    public Services findServiceById(int id) {
        return entityManager.createQuery("SELECT sv FROM Services sv WHERE sv.id = :id", Services.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void addServices(Services services) {

    }
}
