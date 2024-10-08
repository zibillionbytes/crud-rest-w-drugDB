package com.drugz.springboot.cruddemo.dao;

import com.drugz.springboot.cruddemo.entity.Drug;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DrugDAO {

    List<Drug> findAll();

    List<Drug> searchByAnyColumn(String searchTerm);

    /*
    @Transactional
    List<Drug> findByMedicalCondition(String medicalCondition);
    */
    Drug save(Drug theDrug);

    void deleteById(int drugId);
}
