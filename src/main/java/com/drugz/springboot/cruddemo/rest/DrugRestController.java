package com.drugz.springboot.cruddemo.rest;

import com.drugz.springboot.cruddemo.entity.Drug;
import com.drugz.springboot.cruddemo.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/drugs")
public class DrugRestController {

    @Autowired
    private DrugService drugService;


    @GetMapping("/search")
    public List<Drug> searchDrugs(@RequestParam String searchTerm){
        return drugService.searchByAnyColumn(searchTerm);
    }

    /*
    @GetMapping("/drugs")
    public List<Drug> getDrugs(@RequestParam String medicalCondition){

        return drugService.findByMedicalCondition(medicalCondition);
    }

     */

}
