package services;

import entities.Phones;

public interface PhoneService {
    void add(Phones phone);

    void change(Phones phone);

    Phones findPhoneNumber(String phone_number);

}
