package com.example.phoneoperator.services.implementation;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.repositories.implementations.PhoneRepositoryImpl;
import com.example.phoneoperator.services.PhoneService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl  implements PhoneService {
    @Autowired
    PhoneRepositoryImpl phoneRepository;
    @Override
    public void findPhoneByPhoneNumber(String phoneNumber) {
        phoneRepository.findPhoneByPhoneNumber(phoneNumber);
    }

    @Override
    public boolean checkIsBlocked() {
        return false;
    }

    @Override
    public boolean checkIsFree() {
        return false;
    }

    @Override
    public List<Phone> findAllWithPersonalType() {
        return null;
    }

    @Override
    public void addPhone(PhoneDto phoneDto) {

    }
}
