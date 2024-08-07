package com.drugz.springboot.cruddemo.service;

import com.drugz.springboot.cruddemo.entity.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface DrugService {


        @Autowired

        List<Drug> findAll();

        @Transactional
        List<Drug> findByMedicalCondition(String medicalCondition);

        Drug save(Drug theDrug);

        void deleteById(int theId);
}
