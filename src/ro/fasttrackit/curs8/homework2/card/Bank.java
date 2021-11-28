package ro.fasttrackit.curs8.homework2.card;

public interface Bank {
    String bankName();

    void checkSold(String holderName);

    void withDraw();

    void deposit();

    boolean checkPIN(String inOrderTo);

    boolean isBlocked();
}
