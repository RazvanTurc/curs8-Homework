package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;

import java.util.Random;
import java.util.Scanner;

public class BankBT implements Bank {

    private final long cardNr;
    private int PIN;
    private int sold;
    private boolean blocked;

    public BankBT() {
        this.PIN = inputNewPIN("Please enter your new PIN: ");
        this.cardNr = generateCardNr();
        this.blocked = false;
    }

    public int inputNewPIN(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int pin = sc.nextInt();

        while (String.valueOf(pin).length() != 4 ) {
            System.out.print("Please enter a valid PIN consisting of 4 numbers: ");
            pin = sc.nextInt();
        }
        System.out.print("Please reenter the PIN: ");
        int tempPin = sc.nextInt();

        while(tempPin != pin){
            System.out.print("Incorrect PIN, please try again: ");
            tempPin = sc.nextInt();
        }
        return pin;
    }

    public int inputPIN(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);

        int tempPin = sc.nextInt();
        int count = 2;

        while (tempPin != getPIN() && count != 0) {
            System.out.println("You have " + count + " more tries \n" +
                    "Please enter the correct PIN: ");
            tempPin = sc.nextInt();
            count--;
        }

        if(count == 0) {
            System.out.print("You entered the wrong PIN 3 times. Your card is now blocked");
            blocked = true;
        }
        return tempPin;
    }

    public long generateCardNr() {
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

    public int getPIN() {
        return PIN;
    }

    public void checkSold(String holderName) {
        if(!isBlocked()) {
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
                int amount = amountInput("Please enter the amount you wish to deposit: ");
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
                int amount = amountInput("Please enter the amount you wish to withdraw: ");
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
    public int amountInput(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextInt();
    }

    @Override
    public boolean checkPIN(String inOrderTo) {
        return inputPIN("Please enter your PIN " + inOrderTo) == getPIN();
    }

    @Override
    public boolean isBlocked() {
        return blocked;
    }
}
