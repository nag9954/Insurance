package com.example.insurance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="INSURANSE_DTLS")
public class InsuranceEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name ="user_name")
    private String name;

    @Column(name ="Inc_Type")
    private String insuranseType;

    @Column(name ="Eligible_Amount")
    private double eligibility;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInsuranseType() {
        return insuranseType;
    }

    public void setInsuranseType(String insuranseType) {
        this.insuranseType = insuranseType;
    }

    public double getEligibility() {
        return eligibility;
    }

    public void setEligibility(double eligibility) {
        this.eligibility = eligibility;
    }
}
