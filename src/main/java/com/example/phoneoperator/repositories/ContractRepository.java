package com.example.phoneoperator.repositories;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.domain.Phone;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContractRepository {
    Contract changePhoneNumberButSaveTariff(String oldPhoneNumber, String newPhoneNumber);
    List<Contract> findAllWithDateAbove(String date);
    List<Object[]> getPhoneGigabitesAndMinutesRemain(String phone_number);
}