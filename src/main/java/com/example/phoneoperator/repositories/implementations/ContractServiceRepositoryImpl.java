package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.domain.ServiceContract;
import com.example.phoneoperator.domain.Services;
import com.example.phoneoperator.domain.StatusEnum;
import com.example.phoneoperator.repositories.ContractServiceRepository;
import com.example.phoneoperator.repositories.GenericRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ContractServiceRepositoryImpl extends GenericRepository<ServiceContract, Long> implements ContractServiceRepository {
    public ContractServiceRepositoryImpl() {
        super(ServiceContract.class);
    }

    @Autowired
    EntityManager entityManager;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ServiceContract findServiceContractById(int id) {
        return
                entityManager.createQuery("SELECT ph FROM ServiceContract ph WHERE ph.id = :id", ServiceContract.class)
                        .setParameter("id", id)
                        .getSingleResult();
    }


    @Transactional
    @Override
    public ServiceContract addServiceContract(ServiceContract serviceContract) {
        if (serviceContract.getId() == null) {
            entityManager.persist(serviceContract);
        } else {
            entityManager.merge(serviceContract);
        }
        return serviceContract;

    }

}
