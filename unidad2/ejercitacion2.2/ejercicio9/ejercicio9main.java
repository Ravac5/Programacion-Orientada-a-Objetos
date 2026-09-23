public class ejercicio9main{
    public static void main(String[] args){
        giftCard card1 = new giftCard("HJDK-0394", 2500);
        giftCard card2 = new giftCard("IELF-9472", 35000);
        cliente cliente1 = new cliente("Marcos Araya", card1);
        cliente cliente2 = new cliente("Selena Gutierrez", card2);

        System.out.println(cliente1.realizarCompra(5000));
        System.out.println(cliente2.realizarCompra(5000));
    }
}
