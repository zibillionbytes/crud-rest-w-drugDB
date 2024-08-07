package com.drugz.springboot.cruddemo.dao;

import com.drugz.springboot.cruddemo.entity.Drug;

import java.util.List;

public interface DrugDAO {

    List<Drug> findAll();

    Drug findById(int theId);

    Drug save(Drug theDrug);

    void deleteById(int theId);
}
