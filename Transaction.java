// Es posible crear una nueva instancia de la clase "MovimientoDinero"
// Es posible leer y modificar el monto del movimiento
// Es posible leer y modificar el concepto del movimiento
// Es posible crear montos positivos y negativos
// Es posible definir qué usuario fue encargado de registrar el movimiento
public class Transaction {
// Attributes
    private float Amount;
    private boolean TypeAmount;
    private String Concept;
    private String User;
// Builder
    public Transaction(float Amount, boolean TypeAmount, String Concept, String User) {
        this.Amount = Amount;
        this.TypeAmount = TypeAmount;
        this.Concept = Concept;
        this.User = User;
    }
// Getters & Setters
    public float getAmount() {
        return Amount;
    }
    public void setAmount(float Amount) {
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
    public static float TypeAmount(boolean TypeAmount,float Amount){
        if(TypeAmount==true){
          return Amount;
        }
        else {
            return Amount*-1;
        }
    }
    public static String DefineUser(String User){
        return User; 
    }
}
