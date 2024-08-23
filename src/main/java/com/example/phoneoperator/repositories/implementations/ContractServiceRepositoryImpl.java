package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.domain.ServiceContract;
import com.example.phoneoperator.repositories.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceContractRepositoryImpl extends GenericRepository<ServiceContract,Long> {
}
