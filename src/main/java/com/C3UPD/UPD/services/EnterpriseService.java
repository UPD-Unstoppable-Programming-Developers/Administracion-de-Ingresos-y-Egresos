package com.C3UPD.UPD.services;

import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    Enterprise enterprise;

    static List<Enterprise> enterprises;
    static{
    enterprises = new ArrayList<Enterprise>();
    enterprises.add(new Enterprise(1,"Empresa 1","direccion 1","Telefono 1","NIT 1"));
    enterprises.add(new Enterprise(2,"Empresa 2","direccion 2","Telefono 2","NIT 2"));
    enterprises.add(new Enterprise(3,"Empresa 3","direccion 3","Telefono 3","NIT 3"));
    enterprises.add(new Enterprise(4,"Empresa 4","direccion 4","Telefono 4","NIT 4"));
    enterprises.add(new Enterprise(5,"Empresa 5","direccion 5","Telefono 5","NIT 5"));

    }

    public EnterpriseService() {
        //this.enterprise = new Enterprise();
        //enterprise.setName("Empresa UPD Reload 1");

    }

    public List<Enterprise> getEnterprises() {

        return enterprises;
    }

    public Enterprise getEnterpriseID(int id){
        enterprise = null;
        for(Enterprise e : enterprises){
            if(e.getId()==id){
                enterprise = e;
                break;
            }
        }
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {

        this.enterprise = enterprise;
    }
    public Enterprise addEnterprise(Enterprise newEnterprise){
        enterprises.add(newEnterprise);
        return enterprises.get(enterprises.size()-1);

    }
*/
}
