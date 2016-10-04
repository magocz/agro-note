package com.an.bc.user.repo;

import com.an.bc.user.impl.UserDO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
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
        List<UserBE> userBEs = entityManager.createNamedQuery(UserBE.FIND_BY_USERNAME).setParameter(UserBE.USERNAME, username).getResultList();
        return userBEs.isEmpty() ? null : userBEs.get(0);
    }

    public UserBE findByUsernameAndMail(String username, String mail) {
        List<UserBE> userBEs = entityManager.createNamedQuery(UserBE.FIND_BY_USERNAME_AND_MAIL)
                .setParameter(UserBE.USERNAME, username)
                .setParameter(UserBE.MAIL, mail)
                .getResultList();
        return userBEs.isEmpty() ? null : userBEs.get(0);
    }

    public UserBE findByUsernameAndPassword(String username, String password) {
        List<UserBE> userBEs = entityManager.createNamedQuery(UserBE.FIND_BY_USERNAME_AND_PASSWORD)
                .setParameter(UserBE.USERNAME, username)
                .setParameter(UserBE.PASSWORD, password)
                .getResultList();
        return userBEs.isEmpty() ? null : userBEs.get(0);
    }

    @Transactional
    public UserBE updateUser(UserBE userBE) {
        entityManager.merge(userBE);
        return userBE;
    }

    public UserBE saveUser(UserDO userDO) {
        UserBE userBE = new UserBE(userDO);
        userBE.setPassword(userBE.getHashedPassword());
        entityManager.persist(userBE);
        entityManager.persist(new UserRoleBE(userBE.getUserName()));
        return userBE;
    }
}
