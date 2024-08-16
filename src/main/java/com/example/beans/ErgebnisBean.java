package com.example.beans;

import com.example.entities.Ergebnis;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Stateless
public class ErgebnisBean {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createErgebnis(String status, String comment, Long testCaseId, Long testerId) {
        Ergebnis ergebnis = new Ergebnis();
        ergebnis.setStatus(status);
        ergebnis.setComment(comment);
        ergebnis.setTestCaseId(testCaseId);
        ergebnis.setTesterId(testerId);
        entityManager.persist(ergebnis);
    }

    public List<Ergebnis> getErgebnisse() {
        return entityManager.createQuery("SELECT e FROM Ergebnis e", Ergebnis.class).getResultList();
    }
}

