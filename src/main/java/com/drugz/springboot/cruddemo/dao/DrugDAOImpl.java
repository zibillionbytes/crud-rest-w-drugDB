package com.drugz.springboot.cruddemo.dao;

import com.drugz.springboot.cruddemo.entity.Drug;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DrugDAOImpl implements DrugDAO {

    // entity manager

    private EntityManager entityManager;

    // constructor injection setup

    @Autowired
    public DrugDAOImpl(EntityManager theEntityManager){entityManager=theEntityManager;}

    @Override
    public List<Drug> findAll() {

        TypedQuery<Drug> theQuery = entityManager.createQuery("from Drug", Drug.class);

        List<Drug> drugs = theQuery.getResultList();

        return drugs;
    }

    @Override
    @Transactional
    public List<Drug> findByMedicalCondition(String medicalCondition) {

        TypedQuery<Drug> theQuery = entityManager.createQuery(
                "FROM Drug WHERE medicalCondition = :medicalCondition", Drug.class);

        theQuery.setParameter("medicalCondition", medicalCondition);

        return theQuery.getResultList();
    }

    @Override
    public Drug save(Drug theDrug) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
