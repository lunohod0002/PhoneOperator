package repositories;

import entities.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface SubscriberRepostory extends JpaRepository<Subscriber, Long> {

    List<Subscriber> findByAge(int age);

    Subscriber findSubscriberByFio(String fio);
}