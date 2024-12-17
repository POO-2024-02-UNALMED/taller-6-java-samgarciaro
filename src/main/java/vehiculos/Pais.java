package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private int ventas = 0;
    private static List<Pais> listaPaises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor() {
        Pais max = null;
        for (Pais pais : listaPaises) {
            if (max == null || pais.getVentas() > max.getVentas()) {
                max = pais;
            }
        }
        return max;
    }
    
    public String getNombre() { return nombre; }
    public int getVentas() { return ventas; }
    public void incrementarVentas() { ventas++; }
}
