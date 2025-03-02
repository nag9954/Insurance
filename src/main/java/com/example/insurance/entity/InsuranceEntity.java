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


}
