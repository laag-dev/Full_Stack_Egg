
package Entidad;


public class RevolverAgua {
    
    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
    }
    
    public RevolverAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver() {
        
       posicionActual = (int) (Math.random()* 6) + 1;
       posicionAgua = (int) (Math.random()* 6) + 1;   
    }
    
    public boolean mojar() {
        
        return posicionAgua == posicionActual;
    }
    
    public int siguienteChorro(){
        
        if (posicionActual > 6) {
            
            posicionActual = 1;
        }
        
        return ++posicionActual;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
