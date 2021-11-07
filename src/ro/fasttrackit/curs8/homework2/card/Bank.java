package ro.fasttrackit.curs8.homework2.card;

public interface Bank {
    String bankName();

    int checkSold();
    int amountInput(String msg);

    void withDraw();
    void deposit();

    boolean checkPIN();
}
