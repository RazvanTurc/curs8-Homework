package ro.fasttrackit.curs8.homework3;

public class MainAnimal {
    public static void main(String[] args) {
        new Behaviour(new Cat()).doAll();
        new Behaviour(new Dog()).doAll();
        new Behaviour(new Mouse()).doAll();
        new Behaviour(new Chicken()).doAll();
        new Behaviour(new Duck()).doAll();

    }
}
