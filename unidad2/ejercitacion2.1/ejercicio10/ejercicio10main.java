public class ejercicio10main {
    public static void main(String[] args){
        personaje kazuma = new personaje("Kazuma", 50);
        personaje megumin = new personaje("Megumin", 50);

        while (megumin.estaVivo() && kazuma.estaVivo()) {
            kazuma.atacar(megumin);
            System.out.println(megumin.getNombre() + " tiene: " + megumin.getVida() + " puntos de vida");
            megumin.atacar(kazuma);
            System.out.println(kazuma.getNombre() + " tiene: " + kazuma.getVida() + " puntos de vida");
        }
        if (kazuma.estaVivo()){
            System.out.println(kazuma.getNombre() + " ha ganado!");
        } else {
            System.out.println(megumin.getNombre() + " ha ganado!");
        }
    }
}
