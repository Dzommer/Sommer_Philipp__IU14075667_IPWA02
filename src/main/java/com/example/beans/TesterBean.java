package com.example.beans;

import com.example.entities.Tester;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
@Stateless
public class TesterBean {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Tester> getTesters() {
        return entityManager.createQuery("SELECT t FROM Tester t", Tester.class).getResultList();
    }
}

