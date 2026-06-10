package dedogordo;

import java.util.ArrayList;
import java.util.HashMap;

public class Zapateria {
    private static final int TAM = 12; 

    private HashMap<Integer, Calzado> inventario;
    private ArrayList<Zapatilla> estanteSport;
    private ArrayList<Integer> zapCode;
    private HashMap<Integer, Sandalia> estantePlaya;
    private Zapato[] estanteNoche;
    private int contadorZapatosNoche;

    public Zapateria() {
        this.inventario = new HashMap<>();
        this.estanteSport = new ArrayList<>();
        this.zapCode = new ArrayList<>();
        this.estantePlaya = new HashMap<>();
        this.estanteNoche = new Zapato[TAM];
        this.contadorZapatosNoche = 0;
    }

    public HashMap<Integer, Calzado> getInventario() {
        return inventario; 
    }
    public ArrayList<Zapatilla> getEstanteSport() {
        return estanteSport; 
    }
    public ArrayList<Integer> getZapCode() {
        return zapCode; 
    }
    public HashMap<Integer, Sandalia> getEstantePlaya() {
        return estantePlaya; 
    }
    public Zapato[] getEstanteNoche() {
        return estanteNoche;
    }

    public void agregarCalzado(Calzado calzado) {

    }

    public void mostrarInventario() {
        System.out.println(" INVENTARIO COMPLETO (DEDO GORDO) ");
        inventario.forEach((codigo, calzado) -> {
            System.out.println("Código Producto: " + codigo);
            calzado.mostrarInformacion();
        });
    }

    public void ordenarEstanteSportPorNombre() {
        this.estanteSport.sort((z1, z2) -> z1.getNombre().compareToIgnoreCase(z2.getNombre()));
    }

    public java.util.List<java.util.Map.Entry<Integer, Sandalia>> obtenerEstantePlayaOrdenadoPorPrecioDesc() {
        java.util.List<java.util.Map.Entry<Integer, Sandalia>> lista = new ArrayList<>(this.estantePlaya.entrySet());
        lista.sort((e1, e2) -> Double.compare(e2.getValue().getPrecio(), e1.getValue().getPrecio()));
        return lista;
    }
    
}