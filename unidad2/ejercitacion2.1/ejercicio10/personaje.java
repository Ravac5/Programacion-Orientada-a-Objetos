public class personaje{
    private int puntosVida, puntosAtaque, randomAtaque;
    private String nombre;

    public personaje(String nombre, int puntosAtaque){
        this.puntosVida = 100;
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
    }

    public int getVida(){
        return puntosVida;
    }

    public String getNombre(){
        return nombre;
    }

    public void atacar(personaje objetivo){
        if (estaVivo()){
            if (objetivo.puntosVida >= this.puntosAtaque){
                this.randomAtaque = (int)(Math.random() * this.puntosAtaque);
                objetivo.puntosVida = objetivo.puntosVida - this.randomAtaque;
            } else {
                objetivo.puntosVida = 0;
            }
            System.out.println(this.nombre + " ha atacado a " + objetivo.nombre + ", Daño realizado: " + this.randomAtaque);
        } else {
            System.out.println(this.nombre + " no puede atacar ya que no tiene puntos de vida");
        }
    }

    public boolean estaVivo(){
        if (puntosVida > 0){
            return true;
        } else {
            return false;
        }
    }
}
