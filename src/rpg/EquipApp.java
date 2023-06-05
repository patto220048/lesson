package rpg;

import rpg.items.Item;

public class EquipApp {
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("MEW");
        Item weppon = new Item("cu", 50, 60, 1000);
        
        wizard1.equip(weppon);
        System.out.println("attackPower: " + wizard1.attackPower);
        System.out.println("difencePower: " + wizard1.defensePower);
        wizard1.hello(weppon);
    }
}
