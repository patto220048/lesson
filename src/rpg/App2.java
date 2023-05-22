package rpg;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Cafe");
        drinks.add("Milk");
        drinks.add("Coconut");
        for (String d : drinks) {
            System.out.println(d);
        }

        int drinksCount = drinks.size();
        System.out.println(drinksCount);
        drinks.set(1, "Coca");

        for (String d : drinks) {
            // System.out.println(d);
        }     
        drinks.remove(0); 
        for (String d : drinks) {
            System.out.println(d);
        }  

        ArrayList<Character> characters = new ArrayList<>();
        Wizard wizard1 = new Wizard("SUSU");
        Wizard wizard2 = new Wizard("soso");
        Warrior warrior1 = new Warrior("wowo");
        characters.add(warrior1);
        characters.add(wizard1);
        characters.add(wizard2);
        for (Character character : characters) {
            character.status();
        }
    }
}
