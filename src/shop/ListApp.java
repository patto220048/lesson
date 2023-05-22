package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ListApp {
    public static void main(String[] args) {
        Map<String, Drink> drinkMap = new HashMap<>();
        drinkMap.put("D0001", new Drink("Milk", 350));
        drinkMap.put("D0002", new Drink("Coca", 450));
        drinkMap.put("D0003", new Drink("Pessi", 300));
        for (Drink drink : drinkMap.values()) {
            System.out.println(drink.name);
        }
        Drink selecDrink = drinkMap.get("D0003");
        System.out.println(selecDrink.name);
        
    }   
    
    
}
