package repositories;

import entities.Subscriber;
import entities.Tariffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TariffRepository extends JpaRepository<Tariffs, Long> {

    Tariffs findByName(String name );
    void deleteTariffsByName(String name);



}