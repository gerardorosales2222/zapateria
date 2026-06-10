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
