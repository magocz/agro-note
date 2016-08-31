package com.an.bc.user.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public UserBE findById(Long id) {
        return id == null ? null : entityManager.find(UserBE.class, id);
    }

    public Long findUserIdByUsername(String username) {
        UserBE userBE = findByUsername(username);
        return userBE == null ? null : userBE.getId();
    }

    public UserBE findByUsername(String username) {
        return (UserBE) entityManager.createNamedQuery(UserBE.FIND_BY_USERNAME).setParameter(UserBE.USERNAME, username).getSingleResult();
    }

    public UserBE findByUsernameAndMail(String username, String mail) {
        return (UserBE) entityManager.createNamedQuery(UserBE.FIND_BY_USERNAME_AND_MAIL)
                .setParameter(UserBE.USERNAME, username)
                .setParameter(UserBE.MAIL, mail)
                .getSingleResult();
    }

    public UserBE findByUsernameAndPassword(String username, String password) {
        return (UserBE) entityManager.createNamedQuery(UserBE.FIND_BY_USERNAME_AND_PASSWORD)
                .setParameter(UserBE.USERNAME, username)
                .setParameter(UserBE.PASSWORD, password)
                .getSingleResult();
    }

    @Transactional
    public UserBE saveUser(String userName, String password, String mail) {
        UserBE userBE = new UserBE(userName, password, mail);
        entityManager.persist(userBE);
        return userBE;
    }

    @Transactional
    public UserBE updateUser(UserBE userBE) {
        entityManager.merge(userBE);
        return userBE;
    }
}
