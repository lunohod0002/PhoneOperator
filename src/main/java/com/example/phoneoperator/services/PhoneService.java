package com.example.phoneoperator.services;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.domain.Phone;

import java.util.List;

public interface PhoneService {
    void findPhoneByPhoneNumber(String phoneNumber);
    boolean checkIsBlocked();
    boolean checkIsFree();
    List<Phone> findAllWithPersonalType();
    void addPhone(PhoneDto phoneDto);


}
