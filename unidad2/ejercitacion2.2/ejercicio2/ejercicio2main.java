public class ejercicio2main {
    public static void main(String[] args){
        String formatoJuego;
        videojuego juego1 = new videojuego("Steins;Gate", "PC", 55701.93);
        videojuego juego2 = new videojuego("Celeste", "PC", 37147);
        videojuego juego3 = new videojuego("Nier:Automata", "PC", 74275.42);

        formatoJuego = String.format("Nombre: %s, Plataforma: %s, Precio: %.2f" , juego1.getTitulo(), juego1.getPlataforma(), juego1.getPrecio());
        System.out.println(formatoJuego);
        formatoJuego = String.format("Nombre: %s, Plataforma: %s, Precio: %.2f" , juego2.getTitulo(), juego2.getPlataforma(), juego2.getPrecio());
        System.out.println(formatoJuego);
        formatoJuego = String.format("Nombre: %s, Plataforma: %s, Precio: %.2f" , juego3.getTitulo(), juego3.getPlataforma(), juego3.getPrecio());
        System.out.println(formatoJuego);
    }
}
