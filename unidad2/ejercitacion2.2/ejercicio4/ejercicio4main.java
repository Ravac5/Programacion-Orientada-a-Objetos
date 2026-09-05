public class ejercicio4main{
    public static void main(String[] args){
        String formato;
        cajaRegistradora caja1 = new cajaRegistradora();

        System.out.println(caja1.registrarVenta(12509.32));
        System.out.println(caja1.registrarVenta(5670.90));
        System.out.println(caja1.registrarVenta(3450.57));

        formato = String.format("Promedio de monto por venta: %.2f", caja1.obtenerPromedioVenta());
        System.out.println(formato);
    }
}
