package com.example.insurance.repo;

import com.example.insurance.entity.InsuranceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IncRepo extends JpaRepository<InsuranceEntity, Serializable> {
}
