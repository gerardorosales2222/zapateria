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
