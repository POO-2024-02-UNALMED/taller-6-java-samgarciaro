package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas = 0;

    private static List<Fabricante> listaFabricantes = new ArrayList<>(); // Lista estática de fabricantes

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaFabricantes.add(this); // Agregar a la lista de fabricantes
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public int getVentas() {
        return ventas;
    }

    public void incrementarVentas() {
        ventas++;
    }

    // Método estático que devuelve el fabricante con más ventas
    public static Fabricante fabricaMayorVentas() {
        Fabricante max = null;
        for (Fabricante fabricante : listaFabricantes) {
            if (max == null || fabricante.getVentas() > max.getVentas()) {
                max = fabricante;
            }
        }
        return max;
    }
}
