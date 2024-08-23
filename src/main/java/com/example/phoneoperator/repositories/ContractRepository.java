package com.example.phoneoperator.repositories;

import com.example.phoneoperator.Dto.ChangePhoneDto;
import com.example.phoneoperator.Dto.ContractBonusDto;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.domain.Subscriber;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository {
    Contract changePhoneNumberButSaveTariff(ChangePhoneDto changePhoneDto);

    List<Contract> findAllWithDateAbove(String phoneNumber);

    List<Object[]> getPhoneGigabitesAndMinutesRemain(String phone_number);

    Contract buyTariffByBonuses(ContractBonusDto contractBonusDto);

}