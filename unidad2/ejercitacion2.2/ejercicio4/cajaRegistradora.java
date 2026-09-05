public class cajaRegistradora {
    private int totalVentasRealizadas;
    private double montoRecaudado;

    public cajaRegistradora(){
        totalVentasRealizadas = 0;
        montoRecaudado = 0;
    }

    public String registrarVenta(double monto){
        montoRecaudado = monto + montoRecaudado;
        totalVentasRealizadas++;
        return "venta realizada, monto recaudado actual: " + montoRecaudado;
    }

    public double obtenerPromedioVenta(){
        if (totalVentasRealizadas != 0){
            return montoRecaudado / totalVentasRealizadas;
        } else {
            return 0;
        }
    }
}
