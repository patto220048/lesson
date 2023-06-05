package rpg.newRpg;

public class Character {
    public String name;
    public int hp;
    public int exp;
    public int level;
    public int attackPower;
    public int defencePower;

    public Character(String name, int attackPower, int defencePower) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
        this.hp = 50;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public void walk() {
        String message = this.name + "が歩いた";
        System.out.println(message);
    }

    public void talk(Character character, String message) {
        message = character.name + "!" + message;
        System.out.println(message);
    }

    public void attack(Character character) {

        character.hp -= (this.attackPower - character.defencePower);
        if (!character.isAlive()) {
            this.exp++;
        }
    }

    public boolean isAlive() {
        return (this.hp > 0);
    }
}
