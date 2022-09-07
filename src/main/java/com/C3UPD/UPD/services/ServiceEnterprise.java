package com.C3UPD.UPD.services;

import com.C3UPD.UPD.Models.Enterprise;

public class ServiceEnterprise {
    Enterprise enterprise;

    public ServiceEnterprise() {
        this.enterprise = new Enterprise();
        enterprise.setName("Empresa UPD Reload");

    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
