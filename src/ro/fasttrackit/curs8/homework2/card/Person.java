package ro.fasttrackit.curs8.homework2.card;

import java.util.Objects;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = validName(fullName);
    }

    public String getName() { return fullName; }

    private String validName(String fullName) {
        return Objects.requireNonNullElse(fullName, "NOT A VALID NAME");
    }
}
