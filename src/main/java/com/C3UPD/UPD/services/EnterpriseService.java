package com.C3UPD.UPD.services;// Import Models
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.Repository.EnterpriseRepository;

// Import Special Applications
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;
    public Enterprise create(Enterprise enterprise){

        return enterpriseRepository.save(enterprise);
    }

    public List<Enterprise> getAllEnterprise(){

        return enterpriseRepository.findAll();
    }

    public void delete (Enterprise enterprise){

        enterpriseRepository.delete(enterprise);
    }

    public Optional<Enterprise> findById(Long id){

        return enterpriseRepository.findById(id);
    }


}