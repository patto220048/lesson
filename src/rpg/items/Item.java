package rpg.items;

public class Item {
    public String name;
    public int actackPower;
    public int defencePower;
    public int price;

    private ItemType type;


    public Item(String name, int actackPower, int defencePower, int price, ItemType type) {
        this.name = name;
        this.actackPower = actackPower;
        this.defencePower = defencePower;
        this.price = price;
        this.type = type;
    }
    public void setType(ItemType type) {
        this.type = type;
    }
    public ItemType getType() {
        return type;
    }
    public Item(String name, int actackPower, int defencePower, int price) {
        this.name = name;
        this.actackPower = actackPower;
        this.defencePower = defencePower;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getActackPower() {
        return actackPower;
    }
    public void setActackPower(int actackPower) {
        this.actackPower = actackPower;
    }
    public int getDefencePower() {
        return defencePower;
    }
    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
