package com.example.phoneoperator.controllers;

import com.example.phoneoperator.domain.ServiceContract;
import com.example.phoneoperator.Dto.ServiceContractDto;
import com.example.phoneoperator.services.implementation.ServiceContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")

public class ServicesController {
    @Autowired
    ServiceContractServiceImpl serviceContractService;

    @PostMapping("/addService")
    public ServiceContract change(@RequestBody ServiceContractDto serviceContractDto) {
        return serviceContractService.addServiceContract(serviceContractDto);
    }
}
