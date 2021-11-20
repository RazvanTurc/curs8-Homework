package ro.fasttrackit.curs8.homework2.card;

import java.util.Objects;
import java.util.Scanner;

public class Person {
    private Bank bank;
    private final String fullName;

    public Person(Bank bank) {
        this.bank = bank;
        fullName  = validName();
    }

    public void checkSold() {
        bank.checkSold(getName());
        System.out.println();
    }

    public void deposit() {
        bank.deposit();
        System.out.println();
    }

    public void withDraw() {
        bank.withDraw();
        System.out.println();
    }

    public String getName() { return fullName; }

    private String validName() {
        return Objects.requireNonNullElse(
                setName(), "!!! NO NAME !!!");
    }

    private String setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your full name: ");

        return sc.nextLine();
    }
}
