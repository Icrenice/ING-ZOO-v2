package Animals;

public class Zebra extends Herbivore {

    public Zebra(String name){
        super(name, "Zebra zebra!");
    }
    @Override
    public void eatLeaves() {
        System.out.println("Munch munch (Zank yee bra) - "+ name + " is eating leaves.");
    }

    @Override
    public void performTricks() {

    }
}
