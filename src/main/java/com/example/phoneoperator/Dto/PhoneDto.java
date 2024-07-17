package com.example.phoneoperator.Dto;

import com.example.phoneoperator.domain.PhoneTypeEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PhoneDto {
    public String phoneNumber;
    public boolean blocked;
    public boolean free;
    public PhoneTypeEnum telephone_type;
}
