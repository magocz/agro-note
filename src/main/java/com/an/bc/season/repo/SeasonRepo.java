package com.an.bc.season.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SeasonRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public SeasonBE findById(Long id) {
        return id == null ? null : entityManager.find(SeasonBE.class, id);
    }

    public SeasonBE findByIdAndUser(Long seasonId, Long userId) {
        return (SeasonBE) entityManager.createNamedQuery(SeasonBE.FIND_BY_USER_AND_ID)
                .setParameter(SeasonBE.ID, seasonId)
                .setParameter(SeasonBE.USER_ID, userId)
                .getSingleResult();
    }

    public List<SeasonBE> findByUser(Long userId) {
        return entityManager.createNamedQuery(SeasonBE.FIND_BY_USER)
                .setParameter(SeasonBE.USER_ID, userId)
                .getResultList();
    }


    @Transactional
    public void update(SeasonBE seasonBE) {
        entityManager.merge(seasonBE);
    }

    @Transactional
    public void save(SeasonBE seasonBE) {
        entityManager.persist(seasonBE);
    }

}
