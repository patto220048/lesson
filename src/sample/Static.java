package sample;

public class Static {
    public static void main(String[] args) {
        Float ans = calculate(2f);
        System.out.println(ans);
        int total = totalPrice(2, 2);
        System.out.println("Total :"+total);
        greet("phat");
        greet("phat", "ame");
    }

    public static Float calculate(Float x) {
        Float y = x + 5;
        return y;
    }

    public static int totalPrice(int price, int amount) {
        int result = price * amount;
        return result;
    }

    public static void greet(String name) {
        String mess = name + " hello";
        System.out.println(mess);

    }
    public static void greet(String name, String weather) {
        String mess = name + " hello " + weather;
        System.out.println(mess);
    }
    
    
}
