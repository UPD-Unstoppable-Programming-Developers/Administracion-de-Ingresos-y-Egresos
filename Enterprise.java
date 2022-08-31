// Es posible crear una instancia de la clase "Enterprise"
// Es posible leer y modificar el nombre de la empresa
// Es posible leer y modificar la dirección de la empresa
// Es posible leer y modificar el teléfono de la empresa
// Es posible leer y modificar el NIT de la empresa
public class Enterprise {
// Attributes
    private String name;
    private String address;
    private String phone;
    private String NIT;
// Builder
    public Enterprise(String name, String address, String phone, String NIT) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.NIT = NIT;
    }
// Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNIT() {
        return NIT;
    }
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}