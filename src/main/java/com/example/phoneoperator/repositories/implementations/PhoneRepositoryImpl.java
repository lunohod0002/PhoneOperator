package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.repositories.PhoneRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneRepositoryImpl implements PhoneRepository {
    @Autowired
    PhoneRepository phoneRepository;
    @PersistenceContext
    EntityManager entityManager;

    public PhoneRepositoryImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Transactional
    @Override
    public Phone findPhoneByPhoneNumber(String phoneNumber) {
        TypedQuery<Phone> query = entityManager.createQuery("SELECT ph FROM Phone ph WHERE ph.phoneNumber = :phoneNumber", Phone.class);
        query.setParameter("phoneNumber", phoneNumber);
        return query.getSingleResult();
    }

    @Transactional
    @Override
    public List<Phone> findAllPhoneNumbers() {
        TypedQuery<Phone> query = entityManager.createQuery("SELECT e FROM Phone e", Phone.class);
        return query.getResultList();
    }
}
