package ro.fasttrackit.curs8.homework3;

public class Cat implements Behaviour{
    @Override
    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }

    @Override
    public String talk() {
        return "Miau";
    }

    @Override
    public String callAnimal() {
        return "Pss Pss";
    }
}
