// Es posible crear una nueva instancia de la clase "MovimientoDinero"
// Es posible leer y modificar el monto del movimiento
// Es posible leer y modificar el concepto del movimiento
// Es posible crear montos positivos y negativos
// Es posible definir qué usuario fue encargado de registrar el movimiento
public class Transaction {
// Attributes
    private int Amount;
    private boolean TypeAmount;
    private String Concept;
    private String User;
// Builder
    public Transaction(int Amount, boolean TypeAmount, String Concept, String User) {
        this.Amount = Amount;
        this.TypeAmount = TypeAmount;
        this.Concept = Concept;
        this.User = User;
    }
// Getters y Setters
    public int getAmount() {
        return Amount;
    }
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    public boolean getTypeAmount() {
        return TypeAmount;
    }
    public void setTypeAmount(boolean TypeAmount) {
        this.TypeAmount = TypeAmount;
    }
    public String getConcept() {
        return Concept;
    }
    public void setConcept(String Concept) {
        this.Concept = Concept;
    }
    public String getUser() {
        return User;
    }
    public void setUser(String User) {
        this.User = User;
    }
// Method
    public static int TypeAmount(boolean TypeAmount,int Amount){
        if(TypeAmount==true){
          return Amount;}
        else{return Amount*-1;}
    }
    public static String DefineUser(String User){
        return User; 
    }
}
