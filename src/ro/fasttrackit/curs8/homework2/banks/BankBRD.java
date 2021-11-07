package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;
import ro.fasttrackit.curs8.homework2.card.Card;

import java.util.Scanner;

public class BankBRD implements Bank {
    private final Card cardBRD;

    public BankBRD(Card cardBRD) {
        this.cardBRD = cardBRD;
    }

    @Override
    public String bankName() {
        return "BRD";
    }

    @Override
    public int checkSold() {
        System.out.print(
                bankName() +
                        " Card Number: " + cardBRD.getCardNr() + "\n" +
                        cardBRD.getHolderName() + " your balance is: ");

        return cardBRD.getSold();
    }

    @Override
    public void withDraw() {
        if(checkPIN()) {
            int amount = amountInput("Please enter the amount you desire to withdraw: ");
            cardBRD.subtractSold(amount);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    @Override
    public void deposit() {
        if(checkPIN()) {
            int amount = amountInput("Please enter the amount you desire to deposit: ");
            cardBRD.addSold(amount);
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    @Override
    public boolean checkPIN() {
        int pin = cardBRD.inputPIN("Please enter the PIN: ");
        return cardBRD.getPIN() == pin;
    }

    public int amountInput(String msg) {
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

}
