package Animals;
import java.util.Random;

public class Lion extends Carnivore{

    public Lion(String name){
        super(name, "Roooaoaaaaar!");
    }
    @Override
    public void eatMeat() {
        System.out.println("Nomnomnom (thx mate) - "+ name + " is eating meat." );
    }

    @Override
    public void performTricks() {
            Random random = new Random();
            int rnd = random.nextInt(2);
            if (rnd == 0) {
                System.out.println("Lion " + getName() + " roars loudly!");
            } else {
                System.out.println("Lion " + getName() + " performs a somersault!");
            }

    }
}
