package rpg;

import rpg.items.Item;

public interface ICharacter {
    public void attack(Monter monter);
    public boolean isAlive();
    public void magic(Monter monter, String key);
    public void equip (Item item);
    public void hello(Item item);
    
}
