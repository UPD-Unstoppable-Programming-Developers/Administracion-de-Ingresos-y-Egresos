// Es posible crear una nueva instancia de la clase "Empleado"
// Es posible leer y modificar el nombre de un empleado
// Es posible leer y modificar el correo de un empleado
// Es posible leer y modificar la empresa a la que el empleado pertenece
// Es posible leer y modificar el rol del empleado (administrador, operativo)

// Class
public class Employee {
    private String Email;
    private String Name;
    private String Enterprise;
    private String Role;
// Builder
    public Employee(String Email, String Name, String Enterprise, String Role) {
        this.Email = Email;
        this.Name = Name;
        this.Enterprise = Enterprise;
        this.Role = Role;
    }
 // Getters and Setters 
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getEnterprise() {
        return Enterprise;
    }
    public void setEnterprise(String Enterprise) {
        this.Enterprise = Enterprise;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String Role) {
        this.Role = Role;
    } 
}
