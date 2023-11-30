package Animals;

import java.util.Random;

public class Pig extends Herbivore {

    public Pig(String name){
        super(name, "Oink!");
    }
    @Override
    public void eatLeaves() {
        System.out.println("Nomnomnom oink (thx) - "+ name + " is eating leaves.");
    }

    @Override
    public void performTricks() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("Pig " + getName() + " rolls in the mud");
        } else {
            System.out.println("Pig " + getName() + " runs in circles");
        }
    }
}
