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
