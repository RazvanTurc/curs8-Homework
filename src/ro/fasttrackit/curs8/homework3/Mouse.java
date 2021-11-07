package ro.fasttrackit.curs8.homework3;

public class Mouse implements Animal {
    @Override
    public String walk() {
        return "Mouse is walking";
    }

    @Override
    public String eat() {
        return "Mouse is eating";
    }

    @Override
    public String talk() {
        return "Chit chit";
    }

    @Override
    public String callAnimal() {
        return "Nts Nts";
    }
}
