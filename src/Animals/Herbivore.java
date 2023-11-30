package Animals;

import Animals.Animal;

//abstract makes it a blueprint for other classes that will inherit this trait
public abstract class Herbivore extends Animal {


    public Herbivore(String name, String helloText) {
        super(name, helloText);
    }

    public abstract void eatLeaves();
}
