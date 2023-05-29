package rpg;

public abstract class CharacterAbst {
    public abstract void attack(Monter monter);
    public abstract boolean isAlive();
    public abstract void magic(Monter monter, String key);
}
