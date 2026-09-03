public class videojuego {
    private double precio;
    private String titulo, plataforma;

    public videojuego(String titulo, String plataforma, double precio){
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getPlataforma(){
        return plataforma;
    }

    public double getPrecio(){
        return precio;
    }
}
