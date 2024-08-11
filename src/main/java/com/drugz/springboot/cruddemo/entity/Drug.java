package com.drugz.springboot.cruddemo.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="drugs_list")
public class Drug {


    // fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="drug_id")
    private int drugId;

    @Column(name = "drug_name")
    public String drugName;

    @Column(name = "medical_condition")
    public String medicalCondition;

    @Column(name = "side_effects")
    public String sideEffects;

    @Column(name = "generic_name")
    public String genericName;

    @Column(name = "drug_classes")
    public String drugClasses;

    @Column(name = "brand_names")
    public String brandNames;

    @Column(name = "activity")
    public String activity;

    @Column(name = "rx_otc")
    public String rxOtc;

    @Column(name = "pregnancy_category")
    public String pregnancyCategory;

    @Column(name = "csa")
    public String csa;

    @Column(name = "alcohol")
    public String alcohol;

    @Column(name = "related_drugs")
    public String relatedDrugs;

    @Column(name = "medical_condition_description")
    public String medicalCondDesc;

    @Column(name = "rating")
    public BigDecimal rating;

    @Column(name = "num_of_reviews")
    public BigDecimal reviewNum;

    @Column(name = "drug_link")
    public String drugLink;

    @Column(name = "medical_condition_url")
    public String medCondUrl;


    // Constructors

    public Drug (){

    }

    public Drug(String drugName, String medicalCondition, String sideEffects, String genericName, String drugClasses,
                String brandNames, String activity, String rxOtc, String pregnancyCategory, String csa, String alcohol,
                String relatedDrugs, String medicalCondDesc, BigDecimal rating, BigDecimal reviewNum, String drugLink,
                String medCondUrl) {
        this.drugName = drugName;
        this.medicalCondition = medicalCondition;
        this.sideEffects = sideEffects;
        this.genericName = genericName;
        this.drugClasses = drugClasses;
        this.brandNames = brandNames;
        this.activity = activity;
        this.rxOtc = rxOtc;
        this.pregnancyCategory = pregnancyCategory;
        this.csa = csa;
        this.alcohol = alcohol;
        this.relatedDrugs = relatedDrugs;
        this.medicalCondDesc = medicalCondDesc;
        this.rating = rating;
        this.reviewNum = reviewNum;
        this.drugLink = drugLink;
        this.medCondUrl = medCondUrl;
    }


    // Getter and Setters

    public int getDrug_id() {
        return drugId;
    }

    public void setDrug_id(int drug_id) {
        this.drugId = drug_id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getDrugClasses() {
        return drugClasses;
    }

    public void setDrugClasses(String drugClasses) {
        this.drugClasses = drugClasses;
    }

    public String getBrandNames() {
        return brandNames;
    }

    public void setBrandNames(String brandNames) {
        this.brandNames = brandNames;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getRxOtc() {
        return rxOtc;
    }

    public void setRxOtc(String rxOtc) {
        this.rxOtc = rxOtc;
    }

    public String getPregnancyCategory() {
        return pregnancyCategory;
    }

    public void setPregnancyCategory(String pregnancyCategory) {
        this.pregnancyCategory = pregnancyCategory;
    }

    public String getCsa() {
        return csa;
    }

    public void setCsa(String csa) {
        this.csa = csa;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getRelatedDrugs() {
        return relatedDrugs;
    }

    public void setRelatedDrugs(String relatedDrugs) {
        this.relatedDrugs = relatedDrugs;
    }

    public String getMedicalCondDesc() {
        return medicalCondDesc;
    }

    public void setMedicalCondDesc(String medicalCondDesc) {
        this.medicalCondDesc = medicalCondDesc;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public BigDecimal getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(BigDecimal reviewNum) {
        this.reviewNum = reviewNum;
    }

    public String getDrugLink() {
        return drugLink;
    }

    public void setDrugLink(String drugLink) {
        this.drugLink = drugLink;
    }

    public String getMedCondUrl() {
        return medCondUrl;
    }

    public void setMedCondUrl(String medCondUrl) {
        this.medCondUrl = medCondUrl;
    }


    // toStrings

    @Override
    public String toString() {
        return "Drug{" +
                "drug_id=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", medicalCondition='" + medicalCondition + '\'' +
                ", sideEffects='" + sideEffects + '\'' +
                ", genericName='" + genericName + '\'' +
                ", drugClasses='" + drugClasses + '\'' +
                ", brandNames='" + brandNames + '\'' +
                ", activity='" + activity + '\'' +
                ", rxOtc='" + rxOtc + '\'' +
                ", pregnancyCategory='" + pregnancyCategory + '\'' +
                ", csa='" + csa + '\'' +
                ", alcohol='" + alcohol + '\'' +
                ", relatedDrugs='" + relatedDrugs + '\'' +
                ", medicalCondDesc='" + medicalCondDesc + '\'' +
                ", rating=" + rating +
                ", reviewNum=" + reviewNum +
                ", drugLink='" + drugLink + '\'' +
                ", medCondUrl='" + medCondUrl + '\'' +
                '}';
    }
}
