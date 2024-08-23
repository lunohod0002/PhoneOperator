package com.example.phoneoperator.services.implementation;

import com.example.phoneoperator.Dto.ChangePhoneDto;
import com.example.phoneoperator.Dto.ContractBonusDto;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.repositories.implementations.ContractRepositoryImpl;
import com.example.phoneoperator.services.ContractService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepositoryImpl contractRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public Contract changeContractPhoneNumberButSaveTariff(ChangePhoneDto changePhoneDto) {
        return contractRepository.changePhoneNumberButSaveTariff(changePhoneDto);
    }

    @Override
    public List<Object[]> getGigabytesAndMinutesRemain(String phoneNumber) {
        return contractRepository.getPhoneGigabitesAndMinutesRemain(phoneNumber);
    }

    @Override
    public Contract buyTariffByBonuses(ContractBonusDto contractBonusDto) {
        return contractRepository.buyTariffByBonuses(contractBonusDto);
    }

}
