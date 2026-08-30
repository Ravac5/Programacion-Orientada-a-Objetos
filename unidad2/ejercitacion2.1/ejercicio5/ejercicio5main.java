public class ejercicio5main {
    public static void main(String[] args){
        contador contador1 = new contador(5);
        System.out.println("Valor del contador: " + contador1.getValor());
        System.out.println("Incremento en uno: " + contador1.incrementar());
        System.out.println("Incremento en uno: " + contador1.incrementar());
        System.out.println("decremento en uno: " + contador1.decrementar());
        System.out.println("decremento en uno: " + contador1.decrementar());
        System.out.println("Valor del contador: " + contador1.getValor());
    }
}
