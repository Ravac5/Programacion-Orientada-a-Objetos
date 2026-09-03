public class consolaRetro {
    private boolean encendida = false;
    private String modelo, numeroSerie;

    public consolaRetro(String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void encender(){
        encendida = true;
        System.out.println("consola " + modelo + " encendida.");
    }

    public void apagar(){
        encendida = false;
        System.out.println("consola " + modelo + " apagada.");
    }

    public void mostrarEstado(){
        if (encendida){
            System.out.println("Estado de la consola " + modelo + ": encendida");
        } else {
            System.out.println("Estado de la consola " + modelo + ": apagada");
        }
    }
}
