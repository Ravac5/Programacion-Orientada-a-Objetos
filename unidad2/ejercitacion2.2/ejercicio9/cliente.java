public class cliente{
    String nombre;
    giftCard tarjeta;

    public cliente(String nombre, giftCard tarjeta){
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public String realizarCompra(double monto){
        if(tarjeta.descontarSaldo(monto)){
            return String.format("operacion realizada, saldo actual: %.2f",tarjeta.getSaldo());
        } else {
            return String.format("operacion fallida, saldo actual: %.2f", tarjeta.getSaldo());
        }
    }
}
