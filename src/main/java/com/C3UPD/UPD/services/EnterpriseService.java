package com.C3UPD.UPD.services;

// Import Models
import com.C3UPD.UPD.Models.Enterprise;
// Import Special Applications
import java.util.List;
import java.util.ArrayList;


public class EnterpriseService {
    Enterprise Enterprise;
    static List<Enterprise> Enterprises;
    static {
        Enterprises = new ArrayList<Enterprise>();
        Enterprises.add(new Enterprise(1, "Empresa 1", "direccion 1", "Telefono 1", "NIT 1"));
        Enterprises.add(new Enterprise(2, "Empresa 2", "direccion 2", "Telefono 2", "NIT 2"));
        Enterprises.add(new Enterprise(3, "Empresa 3", "direccion 3", "Telefono 3", "NIT 3"));
        Enterprises.add(new Enterprise(4, "Empresa 4", "direccion 4", "Telefono 4", "NIT 4"));
        Enterprises.add(new Enterprise(5, "Empresa 5", "direccion 5", "Telefono 5", "NIT 5"));
        System.out.println(Enterprises);
    }

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
}
