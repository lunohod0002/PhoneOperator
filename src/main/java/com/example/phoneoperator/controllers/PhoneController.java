package com.example.phoneoperator.controllers;

import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.services.PhoneService;
import com.example.phoneoperator.services.implementation.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhoneController {
    @Autowired
    PhoneServiceImpl phoneService;

    @GetMapping("/get_{phoneNumber}")
    public Phone search(@PathVariable String phoneNumber) {
        return phoneService.findPhoneByPhoneNumber(new PhoneOneDto(phoneNumber));
    }

    @GetMapping("/getAll")
    public List<Phone> searchAll() {
        return phoneService.findAll();
    }

}
