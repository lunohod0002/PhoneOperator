package com.example.phoneoperator.controllers;

import com.example.phoneoperator.Dto.*;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.domain.ServiceContract;
import com.example.phoneoperator.services.ContractService;
import com.example.phoneoperator.services.implementation.ContractServiceImpl;
import com.example.phoneoperator.services.implementation.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/contracts")
public class ContractController {
    @Autowired
    ContractService contractService;

    @PutMapping("/changePhoneNumber")
    public Contract change(@RequestBody ChangePhoneDto changePhoneDto) {
        return contractService.changeContractPhoneNumberButSaveTariff(changePhoneDto);
    }

    @GetMapping("/getMinutesAndGigabytes_{phoneNumber}")
    public Object getAll(@PathVariable String phoneNumber) {
        return contractService.getGigabytesAndMinutesRemain( phoneNumber);
    }
    @PostMapping("/buyContractByBonuses")
    public Contract buy(@RequestBody ContractBonusDto contractBonusDto) {
        return contractService.buyTariffByBonuses(contractBonusDto);
    }

}
