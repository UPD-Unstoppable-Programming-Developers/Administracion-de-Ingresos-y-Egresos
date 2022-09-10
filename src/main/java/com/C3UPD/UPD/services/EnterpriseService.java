package com.C3UPD.UPD.services;

// Import Models
import com.C3UPD.UPD.Models.Enterprise;
<<<<<<< HEAD
import com.C3UPD.UPD.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
=======
import com.C3UPD.UPD.Repository.EnterpriseRepository;
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034

// Import Special Applications
import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
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

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EnterpriseService {
    
    @Autowired
    private EnterpriseRepository enterpriseRepository;
    public Enterprise create(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
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
<<<<<<< HEAD
*/
=======
    */
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
}
