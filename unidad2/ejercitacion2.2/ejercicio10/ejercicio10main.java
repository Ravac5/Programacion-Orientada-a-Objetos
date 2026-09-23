public class ejercicio10main{
    public static void main(String[] args){
        articuloGeek articulo1 = new articuloGeek("libro", 2394.945);
        articuloGeek articulo2 = new articuloGeek("remera edicion especial", 10234.245);
        coleccionLote lote1 = new coleccionLote("coleccion de un libro + una remera de edicion especial", articulo1, articulo2);
        System.out.println(String.format("el valor total del lote es: %.2f", lote1.calcularValorLote()));
        lote1.mostrarDetalleLote();
    }
}
