package repositories;

import entities.Phones;
import entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phones, Long> {
    Phones getByPhoneNumber(String phone_number);
}