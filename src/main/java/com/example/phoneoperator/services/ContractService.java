package com.example.phoneoperator.services;

import com.example.phoneoperator.Dto.ChangePhoneDto;
import com.example.phoneoperator.Dto.ContractBonusDto;
import com.example.phoneoperator.domain.Contract;

public interface ContractService {
    Contract changeContractPhoneNumberButSaveTariff(ChangePhoneDto changePhoneDto);
    Object getGigabytesAndMinutesRemain(String phoneNumber);

    Contract buyTariffByBonuses(ContractBonusDto contractBonusDto);

}
