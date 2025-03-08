package com.example.insurance.IncService;

import com.example.insurance.entity.InsuranceEntity;
import com.example.insurance.repo.IncRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class IncServiceTest {

    @Mock
    IncRepo incRepo;

    @InjectMocks
    IncService incService;

    InsuranceEntity insuranceEntity;

    @BeforeEach
    void setUp() {
        insuranceEntity = new InsuranceEntity();
    }

    @Test
    void addingTest(){
        //InsuranceEntity insuranceEntity = new InsuranceEntity();
        when(incRepo.save(insuranceEntity)).thenReturn(insuranceEntity);
        String inc = incService.upsert(insuranceEntity);
        assertNotNull(inc);

    }

    @Test
    void addingTest_Null(){
        //InsuranceEntity insuranceEntity = new InsuranceEntity();
        when(incRepo.save(insuranceEntity)).thenReturn(null);
        String inc = incService.upsert(insuranceEntity);
        assertNull(inc);

    }

    @Test
    void gettingData(){
        int id = 123;
        //InsuranceEntity insuranceEntity = new InsuranceEntity();
        Optional<InsuranceEntity> optionalInsurance = Optional.of(insuranceEntity);
        when(incRepo.findById(id)).thenReturn(optionalInsurance);
        InsuranceEntity inc = incService.getById(id);
        assertNotNull(inc);
    }

    @Test
    void gettingData_Null(){
        int id = 123;
        //InsuranceEntity insuranceEntity = new InsuranceEntity();
        Optional<InsuranceEntity> optionalInsurance = Optional.of(insuranceEntity);
        when(incRepo.findById(id)).thenReturn(Optional.empty());
        InsuranceEntity inc = incService.getById(id);
        assertNull(inc);
    }

    @Test
    void findAllData_Null(){
        List<InsuranceEntity> insuranceList = new ArrayList<>();
        when(incRepo.findAll()).thenReturn(insuranceList);
        List<InsuranceEntity> inc = incService.getAllTypes();
        assertNotNull(inc);
    }

    @Test
    void deleteData(){
        int id = 101;
        when(incRepo.existsById(id)).thenReturn(true);
        String st = incService.deleteById(id);
        assertNotNull(st);
    }

    @Test
    void deleteData_Null(){
        int id = 101;
        when(incRepo.existsById(id)).thenReturn(false);
        String st = incService.deleteById(id);
        assertNotNull(st);
    }
}
