public class contador{
    private int valor;

    public contador(){
        this.valor = 0;
    }

    public contador(int valor){
        this.valor = valor;
    }

    public int incrementar(){
        valor += 1;
        return valor;
    }

    public int decrementar(){
        if (valor != 0){
            valor -= 1;
        }
        return valor;
    }

    public int getValor(){
        return valor;
    }
}
