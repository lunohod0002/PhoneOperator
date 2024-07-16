package services;

import entities.Tariffs;

import java.util.List;

public interface TariffsService {
    void add(Tariffs tariffs);
    Tariffs findTariff(Long id);
    List<Tariffs> findTariffsByPrice(int price);
}
