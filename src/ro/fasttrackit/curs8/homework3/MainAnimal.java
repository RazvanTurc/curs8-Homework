package ro.fasttrackit.curs8.homework3;

public class MainAnimal {
    public static void main(String[] args) {
        new Animal(new Cat()).doAll();
        new Animal(new Dog()).doAll();
        new Animal(new Mouse()).doAll();
        new Animal(new Chicken()).doAll();
        new Animal(new Duck()).doAll();

    }
}
