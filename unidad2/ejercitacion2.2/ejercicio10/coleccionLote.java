public class coleccionLote{
    private String descripcion;
    private articuloGeek articuloPrincipal, articuloSecundario;

    public coleccionLote(String descripcion, articuloGeek articuloPrincipal, articuloGeek articuloSecundario){
        this.descripcion = descripcion;
        this.articuloPrincipal = articuloPrincipal;
        this.articuloSecundario = articuloSecundario;
    }

    public double calcularValorLote(){
        return articuloPrincipal.getPrecioBase() + articuloSecundario.getPrecioBase();
    }

    public void mostrarDetalleLote(){
        System.out.println(String.format("nombre articulo principal: %s, precio del articulo: %.2f", articuloPrincipal.getNombre(), articuloPrincipal.getPrecioBase()));
        System.out.println(String.format("nombre articulo secundario: %s, precio del articulo: %.2f", articuloSecundario.getNombre(), articuloSecundario.getPrecioBase()));
    }
}
