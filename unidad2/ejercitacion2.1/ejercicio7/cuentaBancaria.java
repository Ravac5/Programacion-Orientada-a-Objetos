public class cuentaBancaria{
    private double saldo;
    private String titular;
    public cuentaBancaria(String titular){
        this.titular = titular;
        saldo = 0;
    }

    public cuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            return "monto depositado correctamente, saldo actual: " + saldo;
        } else {
            return "no puede ingresar un monto menor a 0, intente nuevamente";
        }
    }

    public String retirar(double monto){
        if (monto > saldo){
            return "error, saldo insuficiente";
        } else {
            saldo -= monto;
            return "monto retirado correctamente, saldo actual: " + monto;
        }
    }
}
