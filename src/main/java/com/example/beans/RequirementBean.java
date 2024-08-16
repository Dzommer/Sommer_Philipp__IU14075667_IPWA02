package com.example.beans;

import com.example.entities.Requirement;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Stateless
public class RequirementBean {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createRequirement(String name, String description) {
        Requirement requirement = new Requirement();
        requirement.setName(name);
        requirement.setDescription(description);
        entityManager.persist(requirement);
    }

    public List<Requirement> getRequirements() {
        return entityManager.createQuery("SELECT r FROM Requirement r", Requirement.class).getResultList();
    }
}

