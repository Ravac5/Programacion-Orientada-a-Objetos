public class ejercicio4main {
    public static void main(String[] args){
        calculadora calculadora1 = new calculadora();
        System.out.printf("Suma 25.3 + 22.9: %.2f\n", calculadora1.sumar(25.3, 22.9));
        System.out.printf("Resta 32.4 - 22.99: %.2f\n", calculadora1.restar(32.4, 22.99));
        System.out.printf("Multiplicacion 4 * 2.5: %.2f\n", calculadora1.restar(4, 2.5));
        System.out.printf("Division 10 / 5.5: %.2f\n", calculadora1.restar(10, 5.5));
    }
}
