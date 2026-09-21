public class mangaVolume{
    private int numeroTomo, cantidadPaginas;
    private String tituloSerie;
    private boolean edicionEspecial;

    public mangaVolume(String tituloSerie, int numeroTomo, int cantidadPaginas, boolean edicionEspecial){
        this.tituloSerie = tituloSerie;
        this.edicionEspecial = edicionEspecial;
        if (numeroTomo > 0){
            this.numeroTomo = numeroTomo;
        } else {
            this.numeroTomo = 0;
        }
        if (cantidadPaginas > 0){
            this.cantidadPaginas = cantidadPaginas;
        } else {
            this.cantidadPaginas = 0;
        }
    }

    public boolean esEdicionEspecial() {
        return edicionEspecial;
    }
}
