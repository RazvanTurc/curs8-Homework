package ro.fasttrackit.curs8.homework3;

public class Dog implements Behaviour{
    @Override
    public String walk() {
        return "Dog is walking";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }

    @Override
    public String talk() {
        return "Wouf!";
    }

    @Override
    public String callAnimal() {
        return "Css css";
    }
}
