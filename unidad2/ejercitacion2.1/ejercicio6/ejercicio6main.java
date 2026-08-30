public class ejercicio6main{
    public static void main(String[] args){
        libro libro1 = new libro("Don Quijote", "Miguel de Cervantes", 900);

        System.out.println(libro1.leer(90));
        System.out.println("paginas totales: " + libro1.getPaginasTotales());
        System.out.println("progreso: " + libro1.mostrarProgreso() + "%");
    }
}
