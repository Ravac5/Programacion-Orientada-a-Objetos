public class ejercicio9main {
    public static void main(String[] args){
        carritoDeCompras carrito1 = new carritoDeCompras();
        producto producto1 = new producto("Remera", 10500);
        producto producto2 = new producto("Pantalon", 7850);
        producto producto3 = new producto("Medias", 1050);

        System.out.println(carrito1.agregarProducto(producto1));
        System.out.println(carrito1.agregarProducto(producto2));
        System.out.println(carrito1.agregarProducto(producto3));

        carrito1.mostrarDetalle();
    }
}
