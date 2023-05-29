package rpg.items;

public class Item {
    public String name;
    public int actackPower;
    public int defencePower;
    public int price;
    public Item(String name, int actackPower, int defencePower, int price) {
        this.name = name;
        this.actackPower = actackPower;
        this.defencePower = defencePower;
        this.price = price;
    }
    
}
