
package Entidad;

import java.util.ArrayList;


public class Perro {
    
    ArrayList<String> razas = new ArrayList();
    private String raza;

    public Perro(ArrayList<String> razas,String raza) {
        this.razas = razas;
        this.raza = raza;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    

  
  
}
