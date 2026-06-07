package dedogordo;

public class Sandalia extends Calzado{
    private String material;

    public Sandalia(String material, String nombre, float talleAR, int stock, char genero, double precio) {
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
        if(this.material.equals("Corcho") || this.material.equals("Goma")){
            super.setPrecio(super.getPrecio()*1.1);
        }
    }
    
    
    
    
    
}
