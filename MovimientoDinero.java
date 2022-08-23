/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo
 */
public class MovimientoDinero {
    private int Monto;
    private boolean  TipoMonto;
    private String Concepto;
    private String Usuario;

    public MovimientoDinero(int Monto, boolean TipoMonto, String Concepto, String Usuario) {
        this.Monto = Monto;
        this.TipoMonto = TipoMonto;
        this.Concepto = Concepto;
        this.Usuario = Usuario;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }
    
    public static int TipodeMonto(boolean TipoMonto,int Monto){
        if(TipoMonto==true){
          return Monto;}
        else{return Monto*-1;}
    }
    
    public static String DefinirUsuario(String Usuario){
        return Usuario;
        
    }
    
}
