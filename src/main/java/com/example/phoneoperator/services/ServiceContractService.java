package com.example.phoneoperator.services;

import com.example.phoneoperator.domain.ServiceContract;
import com.example.phoneoperator.Dto.ServiceContractDto;

public interface ServiceContractService {
    ServiceContract addServiceContract(ServiceContractDto serviceContractDto);

}
