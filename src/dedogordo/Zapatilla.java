package dedogordo;

public class Zapatilla extends Calzado{
    private String uso;

    public Zapatilla(String nombre, float talleAR, int stock, char genero, double precio, String uso) {
        super(nombre, talleAR, stock, genero, precio);
        this.uso = uso;
    }

    
    
    @Override
    public void calcularPrecio() {
        if(this.uso.equals("Urbano")){
            super.setPrecio(super.getPrecio() * 0.80);
        }
    }
    
    
}
