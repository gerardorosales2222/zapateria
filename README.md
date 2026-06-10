# Zapatería Orientada a Objetos

La zapatería **"Dedo Gordo"** necesita un programa para gestionar su inventario de Calzados. 
Se requiere implementar un sistema en Java que utilice conceptos de colecciones, polimorfismo y ordenamiento para administrar los diferentes tipos de Calzado s que ofrece la tienda. 

#### Clase abstracta Calzado
+ nombre (String): nombre del Calzado. 
+ talleAR (float): número del Calzado (calce).
+ stock (int): cantidad de Calzados en stock. 
+ genero (char): de Hombre o Mujer 
+ precio (double): precio base del Calzado. 

• Constructor que reciba parámetros de todos los atributos e inicialice. Poner Getters y Setters. 

• void mostrarInformacion(): muestra por pantalla el nombre, precio y stock del Calzado . (No es el método toString). 

• Método abstracto void calcularPrecio(). Clases derivadas: Crear tres clases que hereden de Calzado: 

**Zapatilla**

• Atributo adicional: uso (String). Ej. Futbol, Running, Urbano, etc. 

• En calcularPrecio() llama a aplicarDescuento (20%) en Urbanas, y descontar 10% a Running 

**Sandalia**
• Atributo adicional: material (String). Ej. Corcho, Resina, Cuero, Goma, etc. 

• En calcularPrecio() incrementar el precio en un 10% solo para Corcho o Goma. 

**Zapato**

• Atributo adicional: tipo de cierre (String). Ej.: Hebilla, Cordones, Elástico 

• En calcularPrecio() incrementar el precio en un 15% si tiene Hebilla metálica, sino un 5%. 
Indicaciones adicionales: Cada clase derivada debe tener un constructor que reciba e inicialice todos sus atributos, incluyendo los heredados. 

• Sobrescribir mostrarInformacion() para incluir la información específica de cada tipo de Calzado . (Nota: tenga en cuenta que las clases envoltorio implementan compareTo). 

**Clase Zapateria**
• Inventario (HashMap): colección para almacenar los Calzado s en stock, las claves(Keys) serán los códigos del producto. Ej. 101, 102, 103, etc. 

• EstanteSport: es una Lista de Zapatillas, 

• ZapCode: Codigos de las Zapatillas listadas, 

• EstantePlaya: es un Hash Map de Sandalias, 

• EstanteNoche: es un Arreglo tamaño TAM de Zapato, 

• void agregarCalzado (Calzado calzado): agrega un Calzado al inventario. 

• colocarEnEstanteria() : toma todos los Calzado s de tipo Zapatilla, y los coloca en 
• void mostrarInventario(): recorre y muestra el inventario usando forEach. 

• void ordenarPorPrecio(): ordena en forma descendente por precio. 

• void ordenarPorNombre(): ordena en forma ascendente según el nombre. Interfaz Oferta aplicarDescuento(int porcentaje): aplica un descuento sobre el precio según el porcentaje recibido. Implementación: Hacer que la clase Zapatilla implemente esta interfaz. 
Método main() 

1. Crear al menos 12 objetos de cada tipo de Calzado utilizando los constructores de las clases derivadas. Proporcionar valores para todos los atributos. 4 Ejemplos de Zapatillas (Enfoque deportivo y urbano) 

• Zapatilla 1: Puma Future (Talle: 42, Tipo: Fútbol)

• Zapatilla 2: Nike Air Max (Talle: 41, Tipo: Running) 

• Zapatilla 3: Adidas Superstar (Talle: 38, Tipo: Urbano) 

• Zapatilla 4: Under Armour Hovr (Talle: 40, Tipo: Entrenar) 4 Ejemplos de Sandalias (Enfoque veraniego y de moda) 

• Sandalia 1: Birkenstock Arizona (Talle: 42, Material: Corcho) - Hombre 

• Sandalia 2: Havaianas Top (Talle: 37, Material: Goma) - Mujer 

• Sandalia 3: Crocs Classic (Talle: 40, Material: Resina) - Hombre 

• Sandalia 4: Sarkany Ibiza (Talle: 36, Material: Cuero) - Mujer 4 Ejemplos de Zapatos (Enfoque formal y elegante) 

• Zapato 1: Grimoldi Oxford (Talle: 42, Tipo de Cierre: Cordones) 

• Zapato 2: Hush Puppies Loafer (Talle: 41, Tipo de Cierre: Sin Cordones) 

• Zapato 3: Clarks Derby (Talle: 43, Tipo de Cierre: Cordones) 

• Zapato 4: Prüne Stiletto (Talle: 38, Tipo de Cierre: Hebilla) 

2. Agregar los objetos al inventario de Zapateria. Usando “puti f absent” 

3. Actualízale el talle ARG a US en todas las Sandalias (Redondear a entero), 

    • Si es Hombre: (Talla ARG x 0,75) – 22,25 

    • De ser Mujer: (Talla ARG x 0,75) – 20,75 
    Ejemplo (Hombre): Si calzás 41 ARG = (0.75 * 41) – 22.25 = 8.5 US 

4. Recorrer el Inventario, fijarse si containkey o value para: “Adedos”, y otra con clave 201. 5. Usar get or default para buscar: “Adedos” y buscar “Nike Air Max”. Mostrar que devuelve. 
6. Pasa con entrySet a EstanteSport solo Zapatillas, y a ZapCode los códigos de los ítems. Mostrarlos. 
7. Traspasar con key Set y valores de los Zapatos, a EstanteNoche y ZapCode. Mostrarlos. 
8. Pasa con entrySet a EstantePlaya solo Sandalias, y a ZapCode los códigos de los ítems. Mostrarlos. 
9. Llamar con los elementos del Mapa a CALCULAR PRECIO (POLIMORFISMO) 
10. Buscar un elemento en la lista EstanteSport con comparator, use while y equalsIgnoreCase. 

11. Usar un for element o for i, para mostrar el EstanteNoche. 12. Crear y asociar un Iterator al EstantePlaya. Usar el iterator en un for para mostar las Sandalias. 

13. Probar el ordenamiento por nombre en EstanteSport. Luego Mostrar la colección. 

14. Probar el ordenamiento por precio en EstantePlaya. Luego Mostrar la colección. 

15. Probar el método de descuento para las zapatillas en EstanteSport. 

16. Contar cuantas zapatillas son TALLES BAJOS Y ALTOS por debajo del calce 40, o por arriba. RESPONDEMOS: (Justifique brevemente en cada caso) 

17. ¿Qué pasa si intento agregar el objeto (“Puma Future”, 42, 200, ‘H’) a EstanteSport? 

18. ¿Qué pasa si intento agregar el objeto (“Havaianas Top”, 37, 100, ’M’) a EstantePlaya? 

19. ¿Qué pasa si intento agregar el objeto (“Grimoldi Oxford”, 42, 150, ‘H’) a EstanteNoche? 

20. ¿Qué pasa si hago un put al mapa con (101, “Puma SoftRide”, 41, 500, ‘H’) al Inventario? 

21. ¿Qué pasa si hago un putIfAbsent al mapa con (101, “Puma SoftRide”, 41, 500, ‘H’) al Inventario? 

----

# Zapateria.java (Clase Nueva)
```java
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
```

# Calzado.java
```java
package dedogordo;

public abstract class Calzado {
    private String nombre;
    private float talleAR;
    private int stock;
    private char genero;
    private double precio;

    public Calzado(String nombre, float talleAR, int stock, char genero, double precio) {
        this.nombre = nombre;
        this.talleAR = talleAR;
        this.stock = stock;
        this.genero = genero;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTalleAR() {
        return talleAR;
    }

    public void setTalleAR(float talleAR) {
        this.talleAR = talleAR;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre"+this.nombre);
        System.out.println("Precio"+this.precio);
        System.out.println("Stock"+this.stock);
    }
    
    public abstract void calcularPrecio();
    
}
```
# Sandalia.java
```java
package dedogordo;

public class Sandalia extends Calzado {
    private String material;

    public Sandalia(String nombre, float talleAR, int stock, char genero, double precio, String material) {
        super(nombre, talleAR, stock, genero, precio);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void calcularPrecio() {
        if (this.material.equalsIgnoreCase("corcho") || this.material.equalsIgnoreCase("goma")) {
            super.setPrecio(super.getPrecio() * 1.10);
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Material: " + this.material);
    }
}
```
# Zapatilla.java
```java
package dedogordo;

public class Zapatilla extends Calzado implements Oferta {
    private String uso;

    public Zapatilla(String nombre, float talleAR, int stock, char genero, double precio, String uso) {
        super(nombre, talleAR, stock, genero, precio);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public void calcularPrecio() {
        if (this.uso.equalsIgnoreCase("Urbano")) {
            aplicarDescuento(20);
        } else if (this.uso.equalsIgnoreCase("Running")) {
            aplicarDescuento(10);
        }
    }

    @Override
    public void aplicarDescuento(int porcentaje) {
        double nuevoPrecio = super.getPrecio() * (1 - (porcentaje / 100.0));
        super.setPrecio(nuevoPrecio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Uso: " + this.uso);
        System.out.println("---------------------------");
    }
}
```

# Zapato.java
```java
package dedogordo;

public class Zapato extends Calzado {
    private String tipoDeCierre;

    public Zapato(String nombre, float talleAR, int stock, char genero, double precio, String tipoDeCierre) {
        super(nombre, talleAR, stock, genero, precio);
        this.tipoDeCierre = tipoDeCierre;
    }

    public String getTipoDeCierre() {
        return tipoDeCierre;
    }

    public void setTipoDeCierre(String tipoDeCierre) {
        this.tipoDeCierre = tipoDeCierre;
    }

    @Override
    public void calcularPrecio() {
        if (this.tipoDeCierre.equalsIgnoreCase("hebilla") || this.tipoDeCierre.equalsIgnoreCase("hebilla metálica")) {
            super.setPrecio(super.getPrecio() * 1.15);
        } else {
            super.setPrecio(super.getPrecio() * 1.05);
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de cierre: " + this.tipoDeCierre);
    }
}

```

# DedoGordo.java
```java
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
```


# Respuestas 

17. ¿Qué pasa si intento agregar el objeto (“Puma Future”, 42, 200, ‘H’) a EstanteSport?
No compilará. EstanteSport está definido estrictamente como un ArrayList<Zapatilla>. Si intentás pasarle esos parámetros sueltos, el método .add() no los aceptará. Primero debés instanciar un objeto de tipo Zapatilla usando la palabra reservada new y luego pasar el objeto como argumento.

18. ¿Qué pasa si intento agregar el objeto (“Havaianas Top”, 37, 100, ’M’) a EstantePlaya?
Error de compilación por dos motivos: EstantePlaya es un HashMap<Integer, Sandalia>. El método .put() requiere obligatoriamente dos argumentos: una clave (Integer) y un valor (Sandalia). Pasar parámetros sueltos o sin clave generará un fallo inmediato de sintaxis.

19. ¿Qué pasa si intento agregar el objeto (“Grimoldi Oxford”, 42, 150, ‘H’) a EstanteNoche?
Mismo comportamiento que los anteriores. EstanteNoche es un arreglo estático (Zapato[]). Para guardar un elemento se requiere un índice válido (ej. estanteNoche[0] = objetoZapato). No se pueden asignar propiedades primitivas o cadenas directamente a un contenedor de objetos sin instanciar.

20. ¿Qué pasa si hago un put al mapa con (101, “Puma SoftRide”, 41, 500, ‘H’) al Inventario?
Suponiendo que el objeto esté correctamente instanciado como un Calzado, el método .put(key, value) del HashMap funciona reemplazando valores. Como la clave 101 ya existe (la usamos para la "Puma Future"), el mapa pisará/reemplazará el calzado viejo por el nuevo y devolverá el objeto que fue desplazado.

21. ¿Qué pasa si hago un putIfAbsent al mapa con (101, “Puma SoftRide”, 41, 500, ‘H’) al Inventario?
A diferencia del punto anterior, .putIfAbsent verifica si la clave ya se encuentra registrada. Como la clave 101 ya existe en el inventario, el método no modificará nada, rechazará la inserción y mantendrá intacto el calzado original ("Puma Future").