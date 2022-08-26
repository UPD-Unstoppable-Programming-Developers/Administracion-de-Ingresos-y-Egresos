//Modelar una empresa como una clase de Java
//Es posible crear una instancia de la clase "Empresa"
//Es posible leer y modificar el nombre de la empresa
//Es posible leer y modificar la dirección de la empresa
//Es posible leer y modificar el teléfono de la empresa
//Es posible leer y modificar el NIT de la empresa

public class Enterprise {
    private String nombre;
    private String direccion;
    private String telefono;
    private String NIT;

    //Constructor

    public Enterprise(String nombre, String direccion, String telefono, String NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }
    //Get - Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
