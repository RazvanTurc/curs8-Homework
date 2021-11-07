package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;
import ro.fasttrackit.curs8.homework2.card.Card;

import java.util.Scanner;

public class BankBT implements Bank {
    private final Card cardBT;

    public BankBT(Card cardBT) {
        this.cardBT = cardBT;
    }

    @Override
    public String bankName() {
        return "BT";
    }

    @Override
    public int checkSold() {
        System.out.print(
                bankName() +
                        " Card Number: " + cardBT.getCardNr() + "\n" +
                        cardBT.getHolderName() + " your balance is: ");

        return cardBT.getSold();
    }

    @Override
    public void withDraw() {
        if(checkPIN()) {
            int amount = amountInput("Please enter the amount you desire to withdraw: ");
            cardBT.subtractSold(amount);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    @Override
    public void deposit() {
        if(checkPIN()) {
            int amount = amountInput("Please enter the amount you desire to deposit: ");
            cardBT.addSold(amount);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    @Override
    public boolean checkPIN() {
        int pin = cardBT.inputPIN("Please enter the PIN: ");
        return cardBT.getPIN() == pin;
    }

    public int amountInput(String msg) {
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
