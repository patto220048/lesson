package rpg;

public class Character {
    String name ;
    String job ;
    int hp;
    public void walk(String direction){
        String mess = this.name + " moving to " + direction;
        System.out.println(mess);
    }

}
