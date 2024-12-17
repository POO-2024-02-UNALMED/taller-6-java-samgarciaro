package vehiculos;

import java.util.HashMap;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;

    private static int cantidadVehiculos = 0;
    private static int automoviles = 0;
    private static int camionetas = 0;
    private static int camiones = 0;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        cantidadVehiculos++;
        fabricante.incrementarVentas();
        fabricante.getPais().incrementarVentas();
    }

    // Getters
    public String getPlaca() { return placa; }
    public int getPuertas() { return puertas; }
    public int getVelocidadMaxima() { return velocidadMaxima; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public double getPeso() { return peso; }
    public String getTraccion() { return traccion; }
    public Fabricante getFabricante() { return fabricante; }
    public static int getCantidadVehiculos() { return cantidadVehiculos; }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + automoviles + "\nCamionetas: " + camionetas + "\nCamiones: " + camiones;
    }

    public static Pais paisMasVendedor(HashMap<String, Pais> paises) {
        return paises.values().stream().max((p1, p2) -> p1.getVentas() - p2.getVentas()).orElse(null);
    }

    public static Fabricante fabricaMayorVentas(HashMap<String, Fabricante> fabricantes) {
        return fabricantes.values().stream().max((f1, f2) -> f1.getVentas() - f2.getVentas()).orElse(null);
    }

    protected static void incrementarAutomoviles() { automoviles++; }
    protected static void incrementarCamionetas() { camionetas++; }
    protected static void incrementarCamiones() { camiones++; }
}
