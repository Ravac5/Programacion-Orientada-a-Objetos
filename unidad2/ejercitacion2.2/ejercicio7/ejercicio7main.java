public class ejercicio7main {
    public static void main(String[] args){
        calculadoraPromedio calculadora1 = new calculadoraPromedio(0.25);

        calculadora1.calcularPrecioFinal(-23405);
        calculadora1.calcularPrecioFinal(23405);
        calculadora1.calcularPrecioFinal(1200, 1.5);
        calculadora1.calcularPrecioFinal(1200, 0.5);
        calculadora1.calcularPrecioFinal(32400, 35000);
        calculadora1.calcularPrecioFinal(32400, 2050);
    }
}
