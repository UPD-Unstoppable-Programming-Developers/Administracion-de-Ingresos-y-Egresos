package com.C3UPD.UPD.services;

import com.C3UPD.UPD.Models.Enterprise;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseService {
    Enterprise enterprise;
    static List<Enterprise> enterprises;
    static{
    enterprises = new ArrayList<Enterprise>();
    enterprises.add(new Enterprise(1,"Empresa 1","direccion 1","Telefono 1","NIT 1"));
    enterprises.add(new Enterprise(2,"Empresa 2","direccion 2","Telefono 2","NIT 2"));
    enterprises.add(new Enterprise(3,"Empresa 3","direccion 3","Telefono 3","NIT 3"));
    enterprises.add(new Enterprise(4,"Empresa 4","direccion 4","Telefono 4","NIT 4"));
    enterprises.add(new Enterprise(5,"Empresa 5","direccion 5","Telefono 5","NIT 5"));
    System.out.println(enterprises);
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
    public boolean checkEnterpriseExists(Integer id) {
        return enterprise.existsById(id);
    }

    public boolean deleteEnterpriseById( Integer id) {
        enterprise.deleteById (id) ;
        return true;
    }



}
