package com.C3UPD.UPD.services;

// Import Models
import com.C3UPD.UPD.Models.Enterprise;
// Import Special Applications
import java.util.List;

public class EnterpriseService {
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
}
