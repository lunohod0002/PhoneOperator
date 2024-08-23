package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.repositories.GenericRepository;
import com.example.phoneoperator.repositories.PhoneRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PhoneRepositoryImpl extends GenericRepository<Phone,Long> implements PhoneRepository  {
    @Autowired
    EntityManager entityManager;
    ModelMapper modelMapper = new ModelMapper();
    public PhoneRepositoryImpl() {
        super(Phone.class);
    }

    @Override
    public Phone findPhoneByPhoneNumber(PhoneOneDto phoneOneDto) {
        Phone phone = entityManager.createQuery("SELECT ph FROM Phone ph WHERE ph.phoneNumber = :phoneNumber", Phone.class)
                .setParameter("phoneNumber", phoneOneDto.phoneNumber)
                .getSingleResult();
        return phone;

    }

    @Override
    public List<Phone> findAllPhoneNumbers() {
        TypedQuery<Phone> query = entityManager.createQuery("SELECT e FROM Phone e", Phone.class);
        return query.getResultList();
    }
}
