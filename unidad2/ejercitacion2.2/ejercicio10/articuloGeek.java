public class articuloGeek{
    private double precioBase;
    private String nombre;

    public articuloGeek(String nombre, double precioBase){
        if (precioBase > 0){
            this.precioBase = precioBase;
        } else {
            this.precioBase = 0;
        }
        this.nombre = nombre;
    }
    public double getPrecioBase(){
        return precioBase;
    }

    public String getNombre(){
        return nombre;
    }
}
