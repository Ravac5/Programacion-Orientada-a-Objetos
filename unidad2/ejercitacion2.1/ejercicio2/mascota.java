public class mascota{
    private int edad;
    private String nombre, especie;
    public mascota(String nombre, String especie, int edad){
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEspecie(){
        return especie;
    }

    public int getEdad(){
        return edad;
    }
}
