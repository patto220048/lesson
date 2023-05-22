package rpg;

public class Monter {
    
    public String name ;
    public int hp;
    public int mp;
    public int attackPower;
    public int defensePower;
    
    

    public Monter(String name) {
        this.name = name;
        this.hp = 100;
        this.mp = 0;
        this.attackPower = 100;
        this.defensePower = 2;
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
}
