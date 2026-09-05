public class socioGeek{
    private int numeroSocio, puntosFidelidad;
    private String nombre;

    public socioGeek(int numeroSocio, int puntosFidelidad, String nombre){
        this.numeroSocio = numeroSocio;
        this.puntosFidelidad = puntosFidelidad;
        this.nombre = nombre;
    }

    public int getNumeroSocio(){
        return numeroSocio;
    }

    public int getPuntosFidelidad(){
        return puntosFidelidad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPuntosFidelidad(int puntos){
        if (puntos >= 0){
            puntosFidelidad = puntos;
            System.out.println("puntuacion agregada correctamente.");
        } else {
            System.out.println("ERROR! puntuacion invalida.");
        }
    }
}
