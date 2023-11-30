package Animals;

public class Horse extends Herbivore {

    public Horse(String name){
        super(name, "Neighhhh!");
    }
    @Override
    public void eatLeaves() {
        System.out.println("Munch, Munch, (Deehihilihihicious) - "+ name + " is eating leaves.");
    }

    @Override
    public void performTricks() {

    }
}
