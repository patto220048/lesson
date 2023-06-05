package rpg;

import rpg.items.Item;

public abstract class CharacterAbst {
    public abstract void attack(Monter monter);
    public abstract boolean isAlive();
    public abstract void magic(Monter monter, String key);
    public abstract void equip(Item item);
    // public abstract void break(Item item);
}
