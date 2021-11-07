package ro.fasttrackit.curs8.homework2.card;

import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String fullName;

    public Person() {
        fullName  = validName();
    }

    public String getName() { return fullName; }

    private String validName() {
        return Objects.requireNonNullElse(setName(), "NOT A VALID NAME");
    }

    public String setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your full name: ");

        return sc.nextLine();
    }
}
