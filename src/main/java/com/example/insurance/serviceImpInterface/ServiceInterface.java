package com.example.insurance.serviceImpInterface;

import com.example.insurance.entity.InsuranceEntity;

import java.util.List;

public interface ServiceInterface {

     String upsert(InsuranceEntity insuranceEntity);
     InsuranceEntity getById(Integer id);
     List<InsuranceEntity> getAllTypes();
     String deleteById(Integer id);



}
