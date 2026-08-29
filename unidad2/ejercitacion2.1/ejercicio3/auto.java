public class auto{
    private Boolean encendido = false;
    private String marca, modelo;
    public auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String encender(){
        encendido = true;
        return "el estado cambio a encendido";
    }

    public String apagar(){
        encendido = false;
        return "el estado cambio a apagado";
    }

    public String mostrarEstado(){
        if (encendido == true){
            return "estado: encendido";
        } else {
            return "estado: apagado";
        }
    }

}
