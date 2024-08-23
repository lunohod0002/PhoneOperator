package com.example.phoneoperator.repositories;

import com.example.phoneoperator.Dto.ServiceDto;
import com.example.phoneoperator.domain.Services;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository {
    Services findServiceByName(String name);

    Services findServiceById(int id);

    void addServices(Services services);
}
