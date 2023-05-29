package rpg;

import rpg.items.Item;

public class Character implements ICharacter {

    public String name;
    public String job;
    public int hp;
    public int lv;
    public int mp;
    public int attackPower;
    public int defensePower;

    public Character(String name) {
        this.name = name;
        this.job = job;
    }

    public void walk(String direction) {
        String mess = this.name + " moving to " + direction;
        System.out.println(mess);
    }

    public void greet(String mess) {
        System.out.println(mess);
    }

    public void status() {
        System.out.println("---- Status ----");
        System.out.println("Name: " + this.name);
        System.out.println("Job: " + this.job);
        System.out.println("HP: " + this.hp);
        System.out.println("MP: " + this.mp);
        System.out.println("Lv: " + this.lv);
        System.out.println("attack: " + this.attackPower);
        System.out.println("defence: " + this.defensePower);
    }

    public void attack(Character character) {
        int damage = this.attackPower - character.defensePower;
        if (damage > 0) {
            character.hp -= damage;
        }
        System.out.println("Damage: " + damage);
        System.out.println(character.name + " Defense: -" + this.attackPower);
        System.out.println(character.name + " HP: " + character.hp);
    }

    public void attack(Monter monter) {
        int damage = this.attackPower - monter.defensePower;
        if (damage > 0) {
            monter.hp -= damage;
        }
        System.out.println("Damage: " + damage);
        System.out.println(monter.name + " Defense: -" + this.attackPower);
        System.out.println(monter.name + " HP: " + monter.hp);
    }

    @Override
    public boolean isAlive() {
        return (this.hp > 0);
    }

    @Override
    public void magic(Monter monter, String key) {
        if (this.mp > 0){
            System.out.println("magic actack");
        }
    }

    @Override
    public void equip(Item item) {
        this.attackPower += item.actackPower;
        this.defensePower += item.defencePower;
    }

}
