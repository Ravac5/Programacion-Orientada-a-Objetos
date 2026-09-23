public class mangaVolume{
    private int numeroTomo, cantidadPaginas;
    private String tituloSerie;

    private boolean esTomoExtenso(){
        if (cantidadPaginas > 300){
            return true;
        } else {
            return false;
        }
    }

    public mangaVolume(String tituloSerie, int numeroTomo, int cantidadPaginas){
        this.tituloSerie = tituloSerie;
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
        if (esTomoExtenso()){
            return true;
        } else{
            return false;
        }
    }

    @Override

    public String toString(){
        if (esEdicionEspecial()){
            return "titulo: " + tituloSerie + ", numero de tomo: " + numeroTomo + ", cantidad de paginas: " + cantidadPaginas + ", es edicion especial" ;
        } else {
            return "titulo: " + tituloSerie + ", numero de tomo: " + numeroTomo + ", cantidad de paginas: " + cantidadPaginas + ", no es edicion especial" ;
        }
    }
}
