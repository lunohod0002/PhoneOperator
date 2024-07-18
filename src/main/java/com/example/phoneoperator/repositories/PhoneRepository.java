package com.example.phoneoperator.repositories;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Phone;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PhoneRepository {
    Phone findPhoneByPhoneNumber(PhoneOneDto phoneOneDto);
    List<Phone> findAllPhoneNumbers();
}