package com.C3UPD.UPD.services;

// Import Models
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

    public Optional<Enterprise> findById (Long id){
        return enterpriseRepository.findById(id);
    }

    /* 
    Enterprise Enterprise;
    static List<Enterprise> Enterprises;

    // Servicios para la clase Empresa =
    public List<Enterprise> GetEnterprises() {
        return Enterprises;
    }

    public List<Enterprise> PostEnterprises() {
        return Enterprises;
    }

    // Servicios para EmpresaID =
    public Enterprise GetEnterpriseID(int id) {
        Enterprise = null;
        for (Enterprise e : Enterprises) {
            if (e.getId() == id) {
                Enterprise = e;
                break;
            }
        }
        return Enterprise;
    }

    public void SetEnterprise(Enterprise Enterprise) {
        this.Enterprise = Enterprise;
    }

    public Enterprise AddEnterprise(Enterprise NewEnterprise) {
        Enterprises.add(NewEnterprise);
        return Enterprises.get(Enterprises.size() - 1);
    }
    */
}
