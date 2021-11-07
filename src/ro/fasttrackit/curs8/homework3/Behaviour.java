package ro.fasttrackit.curs8.homework3;

public class Behaviour {
    private Animal animal;

    public Behaviour(Animal animal) {
        this.animal = animal;
    }

    public void doAll() {
        System.out.println(animal.walk());
        System.out.println(animal.eat());
        System.out.println(animal.talk());
        System.out.println(animal.callAnimal());
        System.out.println();
    }
}
