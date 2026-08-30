public class ejercicio7main{
    public static void main(String[] args){
        cuentaBancaria cuenta1 = new cuentaBancaria("Marcelo Rodriguez");
        System.out.println(cuenta1.depositar(-1));
        System.out.println(cuenta1.depositar(100000));
        System.out.println(cuenta1.retirar(110000));
        System.out.println(cuenta1.retirar(5230.20));
    }

}
