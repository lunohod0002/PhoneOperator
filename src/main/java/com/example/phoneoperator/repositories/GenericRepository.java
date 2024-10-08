package com.example.phoneoperator.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public abstract class GenericRepository<Entity, T> {

    private final Class<Entity> entityClass;

    public GenericRepository(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(Entity entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public Entity findById(Class<Entity> entityClass, Integer id) {
        return entityManager.find(entityClass, id);
    }

    @Transactional
    public Entity update(Entity entity) {
        return entityManager.merge(entity);
    }
}