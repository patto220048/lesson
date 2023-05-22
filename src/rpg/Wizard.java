package rpg;

public class Wizard extends Character{
    public Wizard(String name){
        super(name);
        this.job = "wizard";
        this.hp = 200;
        this.lv = 10;
        this.mp = 100;
        this.defensePower = 20;
        this.attackPower = 65;
    }
   
}
