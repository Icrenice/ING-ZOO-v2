package Animals;

public class Hippo extends Herbivore {

    public Hippo(String name){
        super(name, "Splash!");
    }
    @Override
    public void eatLeaves() {
        System.out.println("Munch, Munch, Munch (Lovely) - "+ name + " is eating leaves.");
    }

    @Override
    public void performTricks() {

    }
}
