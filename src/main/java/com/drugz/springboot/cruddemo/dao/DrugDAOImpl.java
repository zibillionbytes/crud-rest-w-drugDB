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


    //-----------------------------


    @Override
    public List<Drug> findAll() {

        TypedQuery<Drug> theQuery = entityManager.createQuery("from Drug", Drug.class);

        List<Drug> drugs = theQuery.getResultList();

        return drugs;
    }

    @Override
    public List<Drug> searchByAnyColumn(String searchTerm) {
        List<Drug> results;
        try {
            // check if searchTerm is a number
            boolean isNumeric = searchTerm.chars().allMatch(Character::isDigit);

            String query;
            if (isNumeric){
                // numeric search
                query = "SELECT d FROM Drug d WHERE "+
                        "d.drugId = :searchTerm OR " +
                        "d.rating = :searchTerm OR " +
                        "d.reviewNum = :searchTerm";
                results = entityManager.createQuery(query, Drug.class).setParameter
                        ("searchTerm", Integer.parseInt(searchTerm)).getResultList();

            } else {
                // string search
                query = "SELECT d FROM Drug d WHERE "+
                        "d.drugName LIKE :searchTerm OR " +
                        "d.medicalCondition LIKE :searchTerm OR " +
                        "d.sideEffects LIKE :searchTerm OR " +
                        "d.genericName LIKE :searchTerm OR " +
                        "d.drugClasses LIKE :searchTerm OR " +
                        "d.brandNames LIKE :searchTerm OR " +
                        "d.activity LIKE :searchTerm OR " +
                        "d.rxOtc LIKE :searchTerm OR " +
                        "d.pregnancyCategory LIKE :searchTerm OR " +
                        "d.csa LIKE :searchTerm OR " +
                        "d.alcohol LIKE :searchTerm OR " +
                        "d.relatedDrugs LIKE :searchTerm OR " +
                        "d.medicalCondDesc LIKE :searchTerm OR " +
                        "d.drugLink LIKE :searchTerm OR " +
                        "d.medCondUrl LIKE :searchTerm";
                results = entityManager.createQuery(query, Drug.class).setParameter
                        ("searchTerm", "%" + searchTerm + "%").getResultList();
            }
        } catch (Exception e){
            // exception handling
            e.printStackTrace();
            throw new RuntimeException("Error occurred while searching drugs", e);
        }

    return results;}

    /*
    @Override
    public List<Drug> searchByAnyColumn(String searchTerm) {
        String query = "SELECT d FROM Drug d WHERE " +
                "d.drugId LIKE :searchTerm OR " +
                "d.drugName LIKE :searchTerm OR " +
                "d.medicalCondition LIKE :searchTerm OR " +
                "d.sideEffects LIKE :searchTerm OR " +
                "d.genericName LIKE :searchTerm OR " +
                "d.drugClasses LIKE :searchTerm OR " +
                "d.brandNames LIKE :searchTerm OR " +
                "d.activity LIKE :searchTerm OR " +
                "d.rxOtc LIKE :searchTerm OR " +
                "d.pregnancyCategory LIKE :searchTerm OR " +
                "d.csa LIKE :searchTerm OR " +
                "d.alcohol LIKE :searchTerm OR " +
                "d.relatedDrugs LIKE :searchTerm OR " +
                "d.medicalCondDesc LIKE :searchTerm OR " +
                "d.rating LIKE :searchTerm OR " +
                "d.reviewNum LIKE :searchTerm OR " +
                "d.drugLink LIKE :searchTerm OR " +
                "d.medCondUrl LIKE :searchTerm";

        return entityManager.createQuery(query, Drug.class).setParameter
                ("searchTerm", "&" + searchTerm + "%").getResultList();
    }


     */

    /*
    @Override
    @Transactional
    public List<Drug> findByMedicalCondition(String medicalCondition) {

        TypedQuery<Drug> theQuery = entityManager.createQuery(
                "FROM Drug WHERE medicalCondition = :medicalCondition", Drug.class);

        theQuery.setParameter("medicalCondition", medicalCondition);

        return theQuery.getResultList();
    }
     */

    @Override
    public Drug save(Drug theDrug) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
