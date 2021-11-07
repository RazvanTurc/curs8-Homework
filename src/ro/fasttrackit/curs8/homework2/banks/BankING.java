package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;
import ro.fasttrackit.curs8.homework2.card.Card;

import java.util.Scanner;

public class BankING implements Bank {
    private final Card cardING;

    public BankING(Card cardING) {
        this.cardING = cardING;
    }

    @Override
    public String bankName() {
        return "BT";
    }

    @Override
    public int checkSold() {
        System.out.print(
                bankName() +
                        " Card Number: " + cardING.getCardNr() + "\n" +
                        cardING.getHolderName() + " your balance is: ");

        return cardING.getSold();
    }

    @Override
    public void withDraw() {
        if(checkPIN()) {
            int amount = amountInput("Please enter the amount you desire to withdraw: ");
            cardING.subtractSold(amount);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    @Override
    public void deposit() {
        if(checkPIN()) {
            int amount = amountInput("Please enter the amount you desire to deposit: ");
            cardING.addSold(amount);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    @Override
    public boolean checkPIN() {
        int pin = cardING.inputPIN("Please enter the PIN: ");
        return cardING.getPIN() == pin;
    }

    public int amountInput(String msg) {
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
