package com.example.phoneoperator.repositories;

import com.example.phoneoperator.domain.ServiceContract;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractServiceRepository {
    ServiceContract findServiceContractById(int id);

    ServiceContract addServiceContract(ServiceContract serviceContract);

}
