package ro.fasttrackit.curs8.homework3;

public class Duck implements Behaviour{
    @Override
    public String walk() {
        return "Duck is walking";
    }

    @Override
    public String eat() {
        return "Duck is eating";
    }

    @Override
    public String talk() {
        return "Hssss !";
    }

    @Override
    public String callAnimal() {
        return "Wak wak";
    }
}
