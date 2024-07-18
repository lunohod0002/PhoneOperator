package com.example.phoneoperator.services;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Phone;

import java.util.List;

public interface PhoneService {
    Phone findPhoneByPhoneNumber(PhoneOneDto phoneOneDto);
    boolean checkIsBlocked();
    boolean checkIsFree();
    List<Phone> findAll();
    void addPhone(PhoneDto phoneDto);


}
