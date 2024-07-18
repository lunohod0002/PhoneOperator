package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.repositories.ContractRepository;
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
public class ContractRepositoryImpl extends GenericRepository<Contract, Long> implements ContractRepository {
    EntityManager entityManager;
    @Autowired
    PhoneRepositoryImpl phoneRepository
    ModelMapper modelMapper = new ModelMapper();

    public ContractRepositoryImpl() {
        super(Contract.class);
    }

    @Override
    public Contract changePhoneNumberButSaveTariff(String oldPhoneNumber, String newPhoneNumber) {
        if (phoneRepository.findPhoneByPhoneNumber(new PhoneOneDto(newPhoneNumber)) != null) {
            entityManager.createQuery("UPDATE Contract c SET c.phones.phoneNumber = :oldPhoneNumber WHERE c.phones.phoneNumber = :newPhoneNumber", Contract.class)
                    .setParameter("oldPhoneNumber", oldPhoneNumber)
                    .setParameter("newPhoneNumber", newPhoneNumber)
                    .executeUpdate();
            return entityManager.createQuery("SELECT ct FROM Contract ct WHERE ct.phones.phoneNumber = :newPhoneNumber", Contract.class)

                    .setParameter("newPhoneNumber", newPhoneNumber)
                    .getSingleResult();
        }
        return null;
    }


    @Override
    public List<Contract> findAllWithDateAbove(String date) {
        return null;
    }

    @Override
    public List<Object[]> getPhoneGigabitesAndMinutesRemain(String phone_number) {
    }
}
