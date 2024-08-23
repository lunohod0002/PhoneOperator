package com.example.phoneoperator.Dto;

import com.example.phoneoperator.domain.Services;
import com.example.phoneoperator.domain.StatusEnum;
import com.example.phoneoperator.domain.Subscriber;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ServiceContractDto {
    public int subscriber_id;
    public int service_id;
    public String date;
    public StatusEnum status;

}
