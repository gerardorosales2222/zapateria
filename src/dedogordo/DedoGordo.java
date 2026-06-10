package dedogordo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DedoGordo {
    public static void main(String[] args) {

        Zapateria zapateria = new Zapateria();
        HashMap<Integer, Calzado> inventario = zapateria.getInventario();

        // 1) Crear al menos 12 objetos (4 de cada tipo)
        Zapatilla z1 = new Zapatilla("Puma Future", 42f, 10, 'H', 89000.0, "fútbol");
        Zapatilla z2 = new Zapatilla("Nike Air Max", 41f, 15, 'H', 120000.0, "running");
        Zapatilla z3 = new Zapatilla("Adidas Superstar", 38f, 20, 'M', 95000.0, "urbano");
        Zapatilla z4 = new Zapatilla("Under Armour Hovr", 40f, 8, 'H', 110000.0, "entrenar");

        Sandalia s1 = new Sandalia("Birkenstock Arizona", 42f, 5, 'H', 65000.0, "corcho");
        Sandalia s2 = new Sandalia("Havaianas Top", 37f, 50, 'M', 15000.0, "goma");
        Sandalia s3 = new Sandalia("Crocs Classic", 40f, 30, 'H', 45000.0, "resina");
        Sandalia s4 = new Sandalia("Sarkany Ibiza", 36f, 12, 'M', 180000.0, "cuero");

        Zapato zp1 = new Zapato("Grimoldi Oxford", 42f, 7, 'H', 130000.0, "cordones");
        Zapato zp2 = new Zapato("Hush Puppies Loafer", 41f, 14, 'H', 115000.0, "Sin cordones");
        Zapato zp3 = new Zapato("Clarks Derby", 43f, 6, 'H', 160000.0, "cordones");
        Zapato zp4 = new Zapato("Prüne Stiletto", 38f, 9, 'M', 145000.0, "hebilla");

        // 2) Agregar objetos al inventario usando "putIfAbsent"
        inventario.putIfAbsent(101, z1);
        inventario.putIfAbsent(102, z2);
        inventario.putIfAbsent(103, z3);
        inventario.putIfAbsent(104, z4);
        
        inventario.putIfAbsent(201, s1);
        inventario.putIfAbsent(202, s2);
        inventario.putIfAbsent(203, s3);
        inventario.putIfAbsent(204, s4);
        
        inventario.putIfAbsent(301, zp1);
        inventario.putIfAbsent(302, zp2);
        inventario.putIfAbsent(303, zp3);
        inventario.putIfAbsent(304, zp4);

        // 3) Actualizar talle ARG a US en todas las Sandalias
        for (Calzado c : inventario.values()) {
            if (c instanceof Sandalia) {
                float talleArg = c.getTalleAR();
                float nuevoTalleUS;
                if (c.getGenero() == 'H' || c.getGenero() == 'h') {
                    nuevoTalleUS = Math.round((talleArg * 0.75f) - 22.25f);
                } else {
                    nuevoTalleUS = Math.round((talleArg * 0.75f) - 20.75f);
                }
                c.setTalleAR(nuevoTalleUS); // Reutilizamos el atributo de talle transformándolo a US
            }
        }

        // 4) Verificar si contiene clave 201 o valor "Adedos"
        System.out.println("punto 4");
        boolean tieneClave201 = inventario.containsKey(201);
        boolean tieneValorAdedos = false;
        for (Calzado c : inventario.values()) {
            if (c.getNombre().equalsIgnoreCase("Adedos")) {
                tieneValorAdedos = true;
                break;
            }
        }
        System.out.println("contiene la clave 201?: " + tieneClave201);
        System.out.println("contiene el calzado 'Adedos'?: " + tieneValorAdedos);

        // 5) Usar getOrDefault para buscar "Adedos" y "Nike Air Max"
        System.out.println("------------------------------");
        System.out.println("punto 5");
        Calzado busqueda1 = inventario.getOrDefault(999, null); 
        System.out.println("Busqueda clave 999 (Adedos): " + (busqueda1 == null ? "No encontrado" : busqueda1.getNombre()));
        
        Calzado busqueda2 = inventario.get(102);
        System.out.println("Búsqueda código 102: " + (busqueda2 != null ? busqueda2.getNombre() : "No encontrado"));

        // 6) entrySet a EstanteSport (Zapatillas) y ZapCode
        System.out.println("------------------------------");
        System.out.println("punto 6");
        for (Map.Entry<Integer, Calzado> entry : inventario.entrySet()) {
            if (entry.getValue() instanceof Zapatilla) {
                zapateria.getEstanteSport().add((Zapatilla) entry.getValue());
                zapateria.getZapCode().add(entry.getKey());
            }
        }
        System.out.println("Zapatillas en EstanteSport: " + zapateria.getEstanteSport().size());
        System.out.println("Códigos en ZapCode: " + zapateria.getZapCode());

        // 7) 
        System.out.println("------------------------------");
        System.out.println("punto 7");
        int idxZapato = 0;
        for (Integer key : inventario.keySet()) {
            Calzado c = inventario.get(key);
            if (c instanceof Zapato && idxZapato < zapateria.getEstanteNoche().length) {
                zapateria.getEstanteNoche()[idxZapato] = (Zapato) c;
                idxZapato++;
                // Agregamos también el código a ZapCode si no está
                if (!zapateria.getZapCode().contains(key)) {
                    zapateria.getZapCode().add(key);
                }
            }
        }
        System.out.println("Zapatos traspasados a EstanteNoche.");

        // 8) entrySet a EstantePlaya (Sandalias) y ZapCode
        System.out.println("------------------------------");
        System.out.println("Punto 8 (Pasaje Sandalias)");
        for (Map.Entry<Integer, Calzado> entry : inventario.entrySet()) {
            if (entry.getValue() instanceof Sandalia) {
                zapateria.getEstantePlaya().put(entry.getKey(), (Sandalia) entry.getValue());
                if (!zapateria.getZapCode().contains(entry.getKey())) {
                    zapateria.getZapCode().add(entry.getKey());
                }
            }
        }
        System.out.println("Sandalias en EstantePlaya: " + zapateria.getEstantePlaya().size());

        // 9) Calcular Precio
        System.out.println("------------------------------");
        System.out.println("punto 9");
        for (Calzado c : inventario.values()) {
            c.calcularPrecio();
        }
        System.out.println("Precios recalculados.");

 
        // 10)
        System.out.println("------------------------------");
        System.out.println("punto 10");
        String bNombre = "Nike Air Max";
        ArrayList<Zapatilla> sport = zapateria.getEstanteSport();
        int i = 0;
        boolean encontrado = false;
        while (i < sport.size() && !encontrado) {
            if (sport.get(i).getNombre().equalsIgnoreCase(bNombre)) {
                encontrado = true;
                System.out.println("Elemento encontrado: " + sport.get(i).getNombre());
            }
            i++;
        }
        if(!encontrado) System.out.println("No encontrado " + bNombre);

        // 11)
        System.out.println("------------------------------");
        System.out.println("Punto 11");
        for (Zapato z : zapateria.getEstanteNoche()) {
            if (z != null) {
                z.mostrarInformacion();
            }
        }

        // 12)
        System.out.println("punto 12");
        Iterator<Sandalia> sandaliaIterator = zapateria.getEstantePlaya().values().iterator();
        while (sandaliaIterator.hasNext()) {
            Sandalia s = sandaliaIterator.next();
            s.mostrarInformacion();
        }

        // 13) 
        System.out.println("------------------------------");
        System.out.println("punto 13 - Ordenar por nombre");
        zapateria.ordenarEstanteSportPorNombre();
        for (Zapatilla zap : zapateria.getEstanteSport()) {
            System.out.println("- " + zap.getNombre());
        }

        // 14)
        System.out.println("------------------------------");
        System.out.println("punto 14");
        var playaOrdenada = zapateria.obtenerEstantePlayaOrdenadoPorPrecioDesc();
        for (Map.Entry<Integer, Sandalia> entry : playaOrdenada) {
            System.out.println("- " + entry.getValue().getNombre() + " | Precio: $" + entry.getValue().getPrecio());
        }

        // 15)
        System.out.println("------------------------------");
        System.out.println("punto 15 descuento");
        for (Zapatilla zap : zapateria.getEstanteSport()) {
            zap.aplicarDescuento(5);
            System.out.println("Nuevo precio " + zap.getNombre() + ": $" + zap.getPrecio());
        }

        // 16)
        System.out.println("------------------------------");
        System.out.println("punto 16");
        int bajos = 0;
        int altos = 0;
        for (Zapatilla zap : zapateria.getEstanteSport()) {
            if (zap.getTalleAR() < 40) {
                bajos++;
            } else {
                altos++;
            }
        }
        System.out.println("Zapatillas con Talle Bajo (< 40): " + bajos);
        System.out.println("Zapatillas con Talle Alto (>= 40): " + altos);
    }
}