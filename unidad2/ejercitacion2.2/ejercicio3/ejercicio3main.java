import java.util.ArrayList;

public class ejercicio3main {
    public static void main(String[] args){
        ArrayList<consolaRetro> consolas = new ArrayList<>();

        consolaRetro consola1 = new consolaRetro("N64", "NUJ10185860 - NUS-CPU-01");
        consolas.add(consola1);
        consolaRetro consola2 = new consolaRetro("Sega Saturn", "AD65069644");
        consolas.add(consola2);
        consolaRetro consola3 = new consolaRetro("Playstation Portable", "FB5432574 - PSP-1001");
        consolas.add(consola3);

        for (consolaRetro consolaRetro : consolas) {
            consolaRetro.mostrarEstado();
            consolaRetro.encender();
            consolaRetro.apagar();
        }
    }
}
