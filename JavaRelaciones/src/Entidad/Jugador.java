
package Entidad;


public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;
    
    RevolverAgua revolver = new RevolverAgua();

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverAgua r){
      
        
        
        if (r.mojar()) {
            mojado = true;
        }
        else {
            mojado = false;
            r.siguienteChorro();
        }
    
    
        return mojado;
    }
    
}
