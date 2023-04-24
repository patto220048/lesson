package sample;

public class Condition {
    public static void main(String[] args) {
        int price = 100; 
        int money = 100;
        if (price > money) {
            System.out.println("price is greater than money");
        } 
        else if(price == money) {
            System.out.println("price is equal to money");
        }
        else {
            System.out.println("price is less than money");
        }
    }
}
