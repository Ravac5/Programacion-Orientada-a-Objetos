public class calculadoraPromedio{
    private double descuentoBase;

    public calculadoraPromedio(double descuentoBase){
        if (descuentoBase >= 0.01 & descuentoBase <= 1){
            this.descuentoBase = descuentoBase;
            System.out.println("Parametrizacion correcta.");
        } else {
            System.out.println("Error al parametrizar constructor: valor fuera de rango [0.01 - 1].");
        }
    }

    public void calcularPrecioFinal(double precioBase){
        if (precioBase > 0){
            System.out.println("Precio con descuento base %" + (int)(descuentoBase * 100) + ": " + (precioBase - (precioBase * descuentoBase)));
        } else {
            System.out.println("Precio base no valido.");
        }
    }

    public void calcularPrecioFinal(double precioBase, double porcentajeEspecial){
        if (porcentajeEspecial >= 0.01 & porcentajeEspecial <= 1) {
            System.out.println("Precio con descuento especial %" + (int)(porcentajeEspecial * 100) + ": " + (precioBase - ( precioBase * porcentajeEspecial)));
        } else {
            System.out.println("Error al aplicar porcentaje especial: valor fuera de rango [0.01 - 1].");
        }
    }

    public void calcularPrecioFinal(double precioBase, int cuponFijo){
        if (cuponFijo <= precioBase && cuponFijo > 0){
            System.out.println("Precio con cupon fijo de " + cuponFijo + ": " + (precioBase - cuponFijo));
        } else {
            System.out.println("Cupon no valido.");
        }
    }

}
