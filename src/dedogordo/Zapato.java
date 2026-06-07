package dedogordo;

public class Zapato extends Calzado{
    private String tipoDeCierre;

    public Zapato(String tipoDeCierre, String nombre, float talleAR, int stock, char genero, double precio) {
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
        if(tipoDeCierre.equals("Hebilla")){
            super.setPrecio(super.getPrecio()*1.15);
        }else{
            super.setPrecio(super.getPrecio()*1.05);
        }
    }
    
    
}
