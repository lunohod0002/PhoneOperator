package com.example.phoneoperator.Dto;

import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.domain.Subscriber;
import com.example.phoneoperator.domain.Tariff;

public class ContractDto {
    public String date;
    public int minutes_remain;
    public int gigabytes_remain;

    public int phone_id;
    public int tarrif_id;
    public int subscriber_id;
}
