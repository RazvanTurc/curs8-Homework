package ro.fasttrackit.curs8.homework3;

public class Chicken implements Behaviour{
    @Override
    public String walk() {
        return "Chicken is walking";
    }

    @Override
    public String eat() {
        return "Chicken is eating";
    }

    @Override
    public String talk() {
        return "Pwok pwok";
    }

    @Override
    public String callAnimal() {
        return "Hai ca mi fome!";
    }
}
