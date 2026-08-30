import java.util.ArrayList;

public class estudiante{
    private ArrayList<Double> calificaciones;
    private String nombre;

    public estudiante(String nombre){
        this.nombre = nombre;
        calificaciones = new ArrayList<>();
    }

    public String agregarNota(double nota){
        if (nota >= 0.0 & nota <= 10.0) {
            calificaciones.add(nota);
            return "nota agregada correctamente";
        } else {
            return "error, nota fuera del rango valido";
        }
    }

    public String getNombre(){
        return nombre;
    }

    public double calcularPromedio(){
        int count = 0;
        double sumNota = 0;
        for (Double nota : calificaciones) {
            sumNota += nota;
            count++;
        }
        if (count > 0){
            return (sumNota / count);
        } else {
            return 0;
        }
    }

    public boolean haAprobado(){
        if (calcularPromedio() > 6.0){
            return true;
        } else {
            return false;
        }
    }
}
