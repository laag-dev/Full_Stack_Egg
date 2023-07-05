package tienda.entidades;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private Fabricante fab;

    public Producto(int codigo, String nombre, double precio, Fabricante fab) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fab = fab;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getFab() {
        return fab;
    }

    public void setFab(Fabricante fab) {
        this.fab = fab;
    }

}
