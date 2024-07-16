package services;

import entities.Contract;
import entities.Phones;
import entities.Subscriber;
import entities.Tariffs;

public interface ContractService {
    void create(Phones phone, Subscriber subscriber, Tariffs tariffs);

    void changeTariff(Contract contract, Tariffs tariff);

    void changePhoneNumber(Contract contract, Phones phone);
}
