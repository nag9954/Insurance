package com.example.insurance.IncService;

import com.example.insurance.entity.InsuranceEntity;
import com.example.insurance.repo.IncRepo;
import com.example.insurance.serviceImpInterface.ServiceInterface;
import com.example.insurance.serviceImpInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncService implements ServiceInterface {

    @Autowired
    private IncRepo incRepo;

    @Override
    public String upsert(InsuranceEntity insuranceEntity) {
        incRepo.save(insuranceEntity);
        return "Saved Successfully";
    }


    @Override
    public InsuranceEntity getById(Integer id) {
        Optional<InsuranceEntity> fid = incRepo.findById(id);

        if (fid.isPresent()){
            return fid.get();
        }
        return null;
    }

    @Override
    public List<InsuranceEntity> getAllTypes() {
        return incRepo.findAll();
    }


    @Override
    public String deleteById(Integer id) {
        if (incRepo.existsById(id)){
            incRepo.deleteById(id);
            return "Deleted Successfully";
        }else {
            return "No Record Found";
        }


    }
}
