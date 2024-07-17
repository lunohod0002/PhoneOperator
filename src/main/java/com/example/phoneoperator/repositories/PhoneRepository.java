package com.example.phoneoperator.repositories;

import com.example.phoneoperator.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PhoneRepository{
    Phone findPhoneByPhoneNumber(String phone_number);
    List<Phone> findAllPhoneNumbers();
}