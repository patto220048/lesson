package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorApp {
    public static void main(String[] args) {
        ArrayList<Drink> drinksList = new ArrayList<Drink>();
        drinksList.add(new Drink("kohi", 100));
        drinksList.add(new Drink("coca", 150));
        drinksList.add(new Drink("milk", 230));

        Iterator<Drink> iterator = drinksList.iterator();
        while (iterator.hasNext()) {
            Drink drink = iterator.next();
            System.out.println(drink.name);
        }   
        ListIterator<Drink> listIterator = drinksList.listIterator();
        listIterator.add(new Drink("cafe", 100));
        listIterator.previous();

        while (listIterator.hasNext()) {
            Drink drink = listIterator.next();
            System.out.println(drink.name);
        }
        System.out.println("--------------------------------");
        while (listIterator.hasPrevious()){
            Drink drink = listIterator.previous();
            System.out.println(drink.name);
        }
    }
}
