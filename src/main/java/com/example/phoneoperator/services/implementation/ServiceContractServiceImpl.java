package com.example.phoneoperator.services.implementation;

import com.example.phoneoperator.domain.ServiceContract;
import com.example.phoneoperator.domain.Services;
import com.example.phoneoperator.domain.StatusEnum;
import com.example.phoneoperator.domain.Subscriber;
import com.example.phoneoperator.repositories.implementations.ContractServiceRepositoryImpl;
import com.example.phoneoperator.Dto.ServiceContractDto;
import com.example.phoneoperator.repositories.implementations.ServiceRepositoryImpl;
import com.example.phoneoperator.repositories.implementations.SubscriberRepositoryImpl;
import com.example.phoneoperator.services.ServiceContractService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceContractServiceImpl implements ServiceContractService {
    @Autowired
    ContractServiceRepositoryImpl contractServiceRepository;
    @Autowired
    SubscriberRepositoryImpl subscriberRepository;
    @Autowired
    ServiceRepositoryImpl serviceRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ServiceContract addServiceContract(ServiceContractDto serviceContractDto) {
        Subscriber subscriber = subscriberRepository.findSubscriberById(serviceContractDto.subscriber_id);
        Services services = serviceRepository.findServiceById(serviceContractDto.service_id);
        String date=serviceContractDto.date;
        StatusEnum status=serviceContractDto.status;
        ServiceContract serviceContract=new ServiceContract(subscriber,services,date,status);
        return contractServiceRepository.addServiceContract(serviceContract);
    }
}
