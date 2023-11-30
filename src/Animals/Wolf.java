package Animals;
import java.util.Random;

public class Wolf extends Carnivore{

    public Wolf(String name){
        super(name, "Owoooo!");
    }
    @Override
    public void eatMeat() {
        System.out.println("Hagh hagh num hagh(Thanks)- "+ name + " is eating meat.");
    }

    @Override
    public void performTricks() {
            Random random = new Random();
            int rnd = random.nextInt(2);
            if (rnd == 0) {
                System.out.println("Wolf " + getName() + " gives paw!");
            } else {
                System.out.println("Lion " + getName() + " plays dead!");
            }

    }
}
