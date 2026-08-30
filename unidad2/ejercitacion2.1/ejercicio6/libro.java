public class libro {
    private int paginasTotales, paginaActual = 0;
    private String titulo, autor;

    public libro(String titulo, String autor, int paginasTotales){
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
    }

    public String leer(int paginas){
        paginaActual += paginas;
        if (paginaActual >= paginasTotales){
            paginaActual = paginasTotales;
            return "lectura finalizada, paginas leidas: " + paginaActual ;
        } else {
        return "paginas leidas: " + paginaActual;
        }
    }

    public int mostrarProgreso(){
        if (paginasTotales > 0){
            return (int)((double)paginaActual / (double)paginasTotales * 100);
        } else {
            return 0;
        }
    }

    public int getPaginasTotales(){
        return paginasTotales;
    }
}
