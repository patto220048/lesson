package rpg;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        //TODO Auto-generated constructor stub
        this.job = "warrior";
        this.hp = 300;
        this.lv = 20;
        this.mp  = 0;
        this.defensePower = 50;
        this.attackPower = 25;
    }
    @Override
    public void attack(Character character) {
        System.out.println("Override");
        int attackPower = this.attackPower;
        this.attackPower *= 2;
        super.attack(character);
        this.attackPower = attackPower ;
    }
    
}
