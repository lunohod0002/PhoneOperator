package com.example.phoneoperator.services.implementation;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.repositories.implementations.PhoneRepositoryImpl;
import com.example.phoneoperator.services.PhoneService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl  implements PhoneService {
    @Autowired
    PhoneRepositoryImpl phoneRepository;
    ModelMapper modelMapper =new ModelMapper();
    @Override
    public Phone findPhoneByPhoneNumber(PhoneOneDto phoneOneDto) {
        return phoneRepository.findPhoneByPhoneNumber(phoneOneDto);

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
    public List<Phone> findAll() {
        return phoneRepository.findAllPhoneNumbers();
    }



    @Override
    public void addPhone(PhoneDto phoneDto) {

    }
}
