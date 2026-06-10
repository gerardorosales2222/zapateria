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

    public void ordenarPorPrecio() {
        
    }

    public void ordenarPorNombre() {
        
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

public class DedoGordo {
    public static void main(String[] args) {        
        Zapateria zapateria = new Zapateria();
        
        
    }
}
```