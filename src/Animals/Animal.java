package Animals;

//abstract makes it a blueprint for other classes that will inherit this trait
public abstract class Animal {

    protected String name;
    protected String helloText;
    protected String zookeeperName;

    public Animal(String name, String helloText) {
        this.name = name;
        this.helloText = helloText;
//        this.zookeeperName = zookeeperName;
    }


    public void sayHello(String zookeeperName){
        System.out.println(helloText + " (Hello "+ zookeeperName +" i'm a " + getClass().getSimpleName() + " named: " + name+ ".)");
    }
    public String getName(){
        return name;
    }
    public abstract void performTricks(); // Empty method
}
