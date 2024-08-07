package com.drugz.springboot.cruddemo.service;

import com.drugz.springboot.cruddemo.dao.DrugDAO;
import com.drugz.springboot.cruddemo.entity.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    private DrugDAO drugDAO;

    @Autowired
    public DrugServiceImpl(DrugDAO theDrugDAO){drugDAO = theDrugDAO;}

    @Override
    public List<Drug> findAll() {return drugDAO.findAll();}

    @Override
    public List<Drug> findByMedicalCondition(String medicalCondition) {

        return drugDAO.findByMedicalCondition(medicalCondition);
    }

    @Override
    public Drug save(Drug theDrug) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
