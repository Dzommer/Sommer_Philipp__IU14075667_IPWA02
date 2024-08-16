package com.example.beans;

import com.example.entities.Testfall;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Stateless
public class TestfallBean {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createTestfall(String name, String description, Long requirementId) {
        Testfall testfall = new Testfall();
        testfall.setName(name);
        testfall.setDescription(description);
        testfall.setRequirementId(requirementId);
        entityManager.persist(testfall);
    }

    public List<Testfall> getTestfalle() {
        return entityManager.createQuery("SELECT t FROM Testfall t", Testfall.class).getResultList();
    }
}

