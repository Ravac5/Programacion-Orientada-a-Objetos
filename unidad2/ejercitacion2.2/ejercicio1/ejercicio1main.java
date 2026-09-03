public class ejercicio1main {
    public static void main(String[] args){
        String formato;
        articuloGeek articulo1 = new articuloGeek();
        articuloGeek articulo2 = new articuloGeek();

        articulo1.nombre = "Remera";
        articulo1.precioBase = 10550;
        articulo2.nombre = "Libro";
        articulo2.precioBase = 5600.77;

        formato = String.format("%.2f", articulo1.precioBase);
        System.out.println("nombre del articulo: " + articulo1.nombre + ", precio: " + formato);
        formato = String.format("%.2f", articulo2.precioBase);
        System.out.println("nombre del articulo: " + articulo2.nombre + ", precio: " + formato);

    }
}
