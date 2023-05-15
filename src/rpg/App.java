package rpg;

public class App {
    public static void main(String[] args) {
        Character wizard = new Character();
        wizard.name = "wizard";
        wizard.job = "job";
        wizard.hp = 100;
        wizard.walk("left");
    }

}
