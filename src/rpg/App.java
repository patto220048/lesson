package rpg;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("JIMEHEN");
        Warrior warrior = new Warrior("WAR");
        Warrior warrior1 = new Warrior("WORD");
        // wizard.greet("おっー");
        // warrior.status();
        // warrior.greet("グーグー");
        // warrior.status();
        // warrior.attack(wizard);
        Character [] characters = {
            wizard,
            warrior,
            warrior1
        };

        Monter monter1 = new Monter("DitMemay");
        System.out.println("Monter: "+ monter1.name);


        for (Character c : characters) {
            System.out.println(c.name);
            c.attack(monter1);

        }
        Random rand = new Random();

        int characterIndex = rand.nextInt(characters.length);
        if(monter1.hp > 0) {
            Character character  = characters[characterIndex];
            System.out.println(monter1.name+ " is live!!");
            System.out.println(monter1.name+ " attack !!");
            monter1.attack(character);
           
        } else {
            System.out.println(monter1.name + "is died!!");
        }

    }

}
