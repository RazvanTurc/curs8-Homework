package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;

import java.util.Random;

public class BankBT implements Bank {

    private final long cardNr;
    private int pin;
    private int sold;
    private boolean blocked;
    private final Inputs input = new Inputs();

    public BankBT() {
        this.pin = input.newPin("Please enter your New PIN: ");
        this.cardNr = generateCardNr();
        this.blocked = false;
    }

    public int inputPIN(String msg) {
        System.out.println(msg);

        int tempPin = input.pin();
        int count = 2;

        while (tempPin != pin && count != 0) {
            System.out.println("You have " + count + " more tries \n" +
                    "Please enter the correct PIN: ");
            tempPin = input.pin();
            count--;
        }

        if (count == 0) {
            System.out.println("You're account has been blocked due to 3 incorrect pin attempts.");
            blocked = true;
            return this.pin = 9874;
        }
        return tempPin;
    }

    private long generateCardNr() {
        Random random = new Random();

        return random.nextLong(
                1000_0000_0000_0000L,
                9999_9999_9999_9999L);
    }

    public String bankName() {
        return "BT Bank";
    }

    public long getCardNr() {
        return cardNr;
    }

    public int getPin() {
        return pin;
    }

    public void checkSold(String holderName) {
        if (!isBlocked()) {
            if (checkPIN("in order to check your sold: ")) {
                System.out.println("Holder Name: " + holderName);
                System.out.println("Bank Service: " + bankName());
                System.out.println("Your Card Nr: " + getCardNr());
                System.out.println("Your Sold is: " + sold);
            } else {
                System.out.println("Incorrect PIN number.");
            }
        } else {
            System.out.println("Your account is blocked.");
        }
    }

    public void deposit() {
        if (!isBlocked()) {
            if (checkPIN("in order to deposit: ")) {
                int amount = input.amount("Please enter the amount you wish to deposit: ");
                if (amount > 0) {
                    this.sold += amount;
                } else {
                    System.out.println("Something is not right.");
                }
            }
        } else {
            System.out.println("Your account is blocked.");
        }
    }

    public void withDraw() {
        if (!isBlocked()) {
            if (checkPIN("in order to withdraw: ")) {
                int amount = input.amount("Please enter the amount you wish to withdraw: ");
                if (amount < 1 || amount > this.sold) {
                    System.out.println("Something went wrong, please try again.");
                } else {
                    this.sold -= amount;
                }
            }
        } else {
            System.out.println("Your account is blocked.");
        }
    }

    @Override
    public boolean checkPIN(String inOrderTo) {
        return inputPIN("Please enter your PIN " + inOrderTo) == getPin();
    }

    @Override
    public boolean isBlocked() {
        return blocked;
    }
}
