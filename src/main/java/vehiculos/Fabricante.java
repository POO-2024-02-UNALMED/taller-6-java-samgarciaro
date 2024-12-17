package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas = 0;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public Pais getPais() { return pais; }
    public int getVentas() { return ventas; }
    public void incrementarVentas() { ventas++; }
}
