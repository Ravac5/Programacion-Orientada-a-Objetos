import java.util.ArrayList;

public class carritoDeCompras {
    ArrayList<producto> productos;

    public carritoDeCompras() {
        productos = new ArrayList<>();
    }

   public String agregarProducto(producto productoVar){
        productos.add(productoVar);
        return productoVar.getNombre() + " agregado";
   }

   public double calcularTotal(){
       double precioFinal = 0;
       for (producto producto : productos) {
           precioFinal += producto.getPrecio();
       }
       return precioFinal;
   }

   public void mostrarDetalle(){
       for (producto producto : productos) {
           System.out.println("Nombre del producto: " + producto.getNombre() + " Precio del producto: " + producto.getPrecio());
       }
       System.out.println("Precio total: " + calcularTotal());
   }
}
