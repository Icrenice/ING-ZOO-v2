package Animals;

import Animals.Animal;

//abstract makes it a blueprint for other classes that will inherit this trait
public abstract class Carnivore extends Animal {

    public Carnivore(String name, String helloText) {
        super(name, helloText);
    }

    public abstract void eatMeat();
}
