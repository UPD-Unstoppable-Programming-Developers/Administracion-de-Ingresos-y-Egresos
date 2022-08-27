// Es posible crear una instancia de la clase "Enterprise"
// Es posible leer y modificar el nombre de la empresa
// Es posible leer y modificar la dirección de la empresa
// Es posible leer y modificar el teléfono de la empresa
// Es posible leer y modificar el NIT de la empresa
public class Enterprise {
// Atributes
    private long IdEnterprise;
    private String NameEnterprise;
    private String Phone;
    private String Address;
// Builder
    public Enterprise(long Id, String NameEnterprise, String Phone, String Address) {
        this.Id = Id;
        this.NameEnterprise = NameEnterprise;
        this.Phone = Phone;
        this.Address = Address;
    }
// Getters and Setters
    public long getId() {
        return Id;
    }
    public void setId(long Id) {
        this.Id = Id;
    }
    public String getNameEnterprise() {
        return NameEnterprise;
    }
    public void setNameEnterprise(String NameEnterprise) {
        this.NameEnterprise = NameEnterprise;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
}
