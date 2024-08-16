package com.example.beans;

import com.example.entities.Testlauf;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Stateless
public class TestlaufBean {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createTestlauf(String name, String description, java.util.Date startDate, java.util.Date endDate) {
        Testlauf testlauf = new Testlauf();
        testlauf.setName(name);
        testlauf.setDescription(description);
        testlauf.setStartDate(startDate);
        testlauf.setEndDate(endDate);
        entityManager.persist(testlauf);
    }

    public List<Testlauf> getTestlaufe() {
        return entityManager.createQuery("SELECT t FROM Testlauf t", Testlauf.class).getResultList();
    }
}

