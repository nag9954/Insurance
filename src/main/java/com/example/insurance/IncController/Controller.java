package com.example.insurance.IncController;


import com.example.insurance.IncService.IncService;
import com.example.insurance.entity.InsuranceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private IncService incService;


    @PostMapping("/save")
    public String createData(@RequestBody InsuranceEntity insuranceEntity){
        String st = incService.upsert(insuranceEntity);
        return "Data Saved";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        incService.deleteById(id);
        return "Deleted Successfully"+id;
    }

    @PutMapping("/update/{id}")
    public String updateData(@RequestBody InsuranceEntity insuranceEntity){
        incService.upsert(insuranceEntity);
        return "Update Successfully";
    }

}
