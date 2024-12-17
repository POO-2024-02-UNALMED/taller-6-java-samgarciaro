package vehiculos;

public class Pais {
    private String nombre;
    private int ventas = 0;

    public Pais(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public int getVentas() { return ventas; }
    public void incrementarVentas() { ventas++; }
}
