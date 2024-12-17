package vehiculos;

import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas = 0;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(List<Fabricante> fabricantes) {
        return fabricantes.stream().max((f1, f2) -> f1.getVentas() - f2.getVentas()).orElse(null);
    }
    public String getNombre() { return nombre; }
    public Pais getPais() { return pais; }
    public int getVentas() { return ventas; }
    public void incrementarVentas() { ventas++; }
}
