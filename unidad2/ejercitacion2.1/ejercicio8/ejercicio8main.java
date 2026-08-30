public class ejercicio8main{
    public static void main(String[] args){
        String promedio = "promedio: %.2f";

        estudiante estudiante1 = new estudiante("Marcos Martinez");
        estudiante estudiante2 = new estudiante("Pedro Landa");
        System.out.println("estudiante: " + estudiante1.getNombre());
        System.out.println(estudiante1.agregarNota(10));
        System.out.println(estudiante1.agregarNota(9));
        System.out.println(estudiante1.agregarNota(9));
        System.out.println(String.format(promedio, estudiante1.calcularPromedio()));
        if (estudiante1.haAprobado()){
            System.out.println("el estudiante ha aprobado;");
        } else {
            System.out.println("el estudiante no ha aprobado");
        }

        System.out.println();

        System.out.println("estudiante: " + estudiante2.getNombre());
        System.out.println(estudiante2.agregarNota(6));
        System.out.println(estudiante2.agregarNota(4));
        System.out.println(estudiante2.agregarNota(7));
        System.out.println(String.format(promedio, estudiante2.calcularPromedio()));
        if (estudiante2.haAprobado()){
            System.out.println("el estudiante ha aprobado;");
        } else {
            System.out.println("el estudiante no ha aprobado");
        }
    }
}
