package vehiculos;

import java.util.List;

public class Pais {
    private String nombre;
    private int ventas = 0;

    public static Pais paisMasVendedor(List<Pais> paises) {
        return paises.stream().max((p1, p2) -> p1.getVentas() - p2.getVentas()).orElse(null);
    }
    public Pais(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public int getVentas() { return ventas; }
    public void incrementarVentas() { ventas++; }
}
