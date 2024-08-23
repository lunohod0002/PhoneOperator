package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.domain.Services;
import com.example.phoneoperator.domain.StatusEnum;
import com.example.phoneoperator.domain.Subscriber;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ServiceContractDto {
    public Subscriber subscriber;
    public Services service;
    public String date;
    public StatusEnum status;

}
