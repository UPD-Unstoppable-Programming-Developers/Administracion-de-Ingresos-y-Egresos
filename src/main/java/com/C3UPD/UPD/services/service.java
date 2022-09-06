package com.C3UPD.UPD.services;

import com.C3UPD.UPD.Models.Enterprise;
import org.springframework.web.bind.annotation.GetMapping;

public class service {
    Enterprise enterprise;

    public service(){
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
