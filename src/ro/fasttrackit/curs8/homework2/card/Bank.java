package ro.fasttrackit.curs8.homework2.card;

public interface Bank {
    String bankName();
    int sold();
    void withDraw(int amount);
    void deposit(int amount);
}
