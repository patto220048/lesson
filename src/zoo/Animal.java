package zoo;

public class Animal {
    public String type;
    public String name;
    
    public Animal(String name) {
        this.name = name;
        System.out.println(this.name);
    }
    public void cry(String oto){
        System.out.println(name + " sua "+ oto);
    }
}
