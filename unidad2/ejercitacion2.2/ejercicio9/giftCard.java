public class giftCard{
    private double saldo;
    private String codigo;

    public giftCard(String codigo, double saldo){
        this.saldo = saldo;
        this.codigo = codigo;
    }
    public boolean descontarSaldo(double monto){
        if(saldo >= monto){
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
