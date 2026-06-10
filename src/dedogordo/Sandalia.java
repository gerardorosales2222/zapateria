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