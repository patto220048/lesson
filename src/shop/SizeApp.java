package shop;

public class SizeApp {
    public static void main(String[] args) {
        Drink drink1 = new Drink("kohi", 300, Size.SMALL);
        Drink drink2 = new Drink("kohi", 400, Size.MEDIUM);
        Drink drink3 = new Drink("kohi", 500, Size.LARGE);
        System.out.println(drink1.size.getValue());
    }
}
