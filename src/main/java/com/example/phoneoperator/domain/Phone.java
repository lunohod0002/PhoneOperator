package com.example.phoneoperator.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "phones")
public class Phone extends BaseEntity {
    private String phoneNumber;
    private boolean blocked;
    private boolean free;
    private PhoneTypeEnum telephone_type;

    public Phone(Long id, String phoneNumber, boolean blocked, boolean free, PhoneTypeEnum telephone_type) {
        this.phoneNumber = phoneNumber;
        this.blocked = blocked;
        this.free = free;
        this.telephone_type = telephone_type;
    }

    protected Phone() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
    @Enumerated(EnumType.STRING)

    public PhoneTypeEnum getTelephone_type() {
        return telephone_type;
    }

    public void setTelephone_type(PhoneTypeEnum telephone_type) {
        this.telephone_type = telephone_type;
    }
}
