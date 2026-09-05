public class comic{
    private int stock;
    private double precio;
    private String titulo;

    public comic(String titulo, double precio, int stock){
        this.titulo = titulo;
        if (precio > 0){
            this.precio = precio;
        } else {
            this.precio = 0;
        }
        if (stock > 0){
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    public double getPrecio(){
        return precio;
    }


    public void setPrecio(double monto){
        precio = monto;
    }

    public int getStock(){
        return stock;
    }

    public void reponerStock(int cantidad){
        stock = cantidad;
    }

    public void venderUnidad(){
        if (stock > 0){
            stock--;
            System.out.println("venta realizada [stock " + stock +"]");
        } else {
            System.out.println("no se puede realizar la venta [stock " + stock + "]");
        }
    }
}
