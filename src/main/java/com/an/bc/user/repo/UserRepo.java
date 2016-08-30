package com.an.bc.user.repo;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public UserBE findById(Long id) {
        UserBE userBE = entityManager.find(UserBE.class, 1L);
        return userBE;
    }
}