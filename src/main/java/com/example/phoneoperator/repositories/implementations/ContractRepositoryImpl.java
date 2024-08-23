package com.example.phoneoperator.repositories.implementations;

import com.example.phoneoperator.Dto.ChangePhoneDto;
import com.example.phoneoperator.Dto.ContractBonusDto;
import com.example.phoneoperator.Dto.PhoneDto;
import com.example.phoneoperator.Dto.PhoneOneDto;
import com.example.phoneoperator.domain.Contract;
import com.example.phoneoperator.domain.Phone;
import com.example.phoneoperator.domain.Subscriber;
import com.example.phoneoperator.domain.Tariff;
import com.example.phoneoperator.repositories.ContractRepository;
import com.example.phoneoperator.repositories.GenericRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class ContractRepositoryImpl extends GenericRepository<Contract, Long> implements ContractRepository {
    @Autowired
    EntityManager entityManager;
    @Autowired
    PhoneRepositoryImpl phoneRepository;
    ModelMapper modelMapper = new ModelMapper();

    public ContractRepositoryImpl() {
        super(Contract.class);
    }
    @Transactional
    @Override
    public Contract changePhoneNumberButSaveTariff(ChangePhoneDto changePhoneDto) {
        String newPhoneNumber = changePhoneDto.newPhoneNumber;
        String oldPhoneNumber = changePhoneDto.oldPhoneNumber;
        System.out.println(newPhoneNumber + "  " +oldPhoneNumber);
        Phone phone=phoneRepository.findPhoneByPhoneNumber(new PhoneOneDto(newPhoneNumber));
        System.out.println(phone.getPhoneNumber());
        if (phoneRepository.findPhoneByPhoneNumber(new PhoneOneDto(oldPhoneNumber)) != null) {
            entityManager.createQuery("UPDATE Contract c SET c.phones = :newPhoneId WHERE c.phones.phoneNumber = :oldPhoneNumber")
                    .setParameter("newPhoneId", phone)
                    .setParameter("oldPhoneNumber",oldPhoneNumber)
                    .executeUpdate();

            return entityManager.createQuery("SELECT ct FROM Contract ct WHERE ct.phones.phoneNumber = :newPhoneNumber", Contract.class)

                    .setParameter("newPhoneNumber", newPhoneNumber)
                    .getSingleResult();
        } else {
            return null;
        }
    }

    @Override
    public List<Contract> findAllWithDateAbove(String phoneNumber) {
        return null;
    }


    @Override
    public List<Object[]> getPhoneGigabitesAndMinutesRemain(String phone_number) {
        System.out.println(phone_number);
        return entityManager.createQuery("SELECT c.gigabytes_remain, c.minutes_remain FROM Contract c WHERE c.phones.phoneNumber = :phone_number", Object[].class)
                .setParameter("phone_number", phone_number)
                .getResultList();

    }
@Transactional
    @Override
    public Contract buyTariffByBonuses(ContractBonusDto contractBonusDto) {
        String phoneNumber=contractBonusDto.phoneNumber;
        int subscriber_id=contractBonusDto.subscriber_id;
        int tariff_id=contractBonusDto.tarrif_id;
    System.out.println(tariff_id);
        Tariff tariff =entityManager.createQuery("SELECT c FROM Tariff c WHERE c.id = :tarrif_id", Tariff.class)
                .setParameter("tarrif_id", tariff_id)
                .getSingleResult();
        Subscriber subscriber=entityManager.createQuery("SELECT sb FROM Subscriber sb WHERE sb.id = :id", Subscriber.class)
                .setParameter("id", subscriber_id)
                .getSingleResult();
        Phone phone = entityManager.createQuery("SELECT ph FROM Phone ph WHERE ph.phoneNumber = :phoneNumber", Phone.class)
                .setParameter("phoneNumber", phoneNumber)
                .getSingleResult();
        if (subscriber.getBonus_number() >=tariff.getPrice()){
            Contract contract=new Contract(contractBonusDto.date,0,0,subscriber,phone,tariff);
            entityManager.persist(contract);
            return contract;
        }
        return null;

    }


}
