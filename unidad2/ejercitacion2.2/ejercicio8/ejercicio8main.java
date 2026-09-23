public class ejercicio8main{
    public static void main(String[] args){
        mangaVolume manga1 = new mangaVolume("fool night", 4, 200);
        mangaVolume manga2 = new mangaVolume("Girl Meets Rock!", 3, 192);
        mangaVolume manga3 = new mangaVolume("Tongari Boushi no Atelier (Grimoire Edition)", 1, 624);

        System.out.println(manga1.toString());
        System.out.println(manga2.toString());
        System.out.println(manga3.toString());
    }
}
