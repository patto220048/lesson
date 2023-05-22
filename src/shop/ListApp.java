package shop;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<Drink> drinks  = new ArrayList<Drink>();
         drinks.add(new Drink("コーヒー", 350, 100));
         drinks.add(new Drink("紅茶", 400, 10));
         drinks.add(new Drink("Coca", 300, 50));

         for (Drink drink : drinks) {
            System.out.println(drink.name);
         }
    }

    
}
