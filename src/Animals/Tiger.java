package Animals;

import java.util.Random;

public class Tiger extends Carnivore {

    public Tiger(String name){
        super(name, "Rraaarww!");
    }
    @Override
    public void eatMeat() {
        System.out.println("Graarw graarw (Tasty) - "+ name + " is eating meat.");
    }

    @Override
    public void performTricks() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("Tiger " + getName() + " jumps in tree");
        } else {
            System.out.println("Tiger " + getName() + " scratches ears");
        }
    }
}
