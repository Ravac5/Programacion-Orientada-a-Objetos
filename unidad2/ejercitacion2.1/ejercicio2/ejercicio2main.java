public class ejercicio2main{
    public static void main(String[] args){
        mascota mascota1 = new mascota("Milo", "gato", 3);
        mascota mascota2 = new mascota("Luna", "perro", 10);
        mascota mascota3 = new mascota("Tobi", "tortuga", 25);

        System.out.println("Nombre: " + mascota1.getNombre() + " Edad: " + mascota1.getEdad() + " Especie: " + mascota1.getEspecie());
        System.out.println("Nombre: " + mascota2.getNombre() + " Edad: " + mascota2.getEdad() + " Especie: " + mascota2.getEspecie());
        System.out.println("Nombre: " + mascota3.getNombre() + " Edad: " + mascota3.getEdad() + " Especie: " + mascota3.getEspecie());
    }
}
