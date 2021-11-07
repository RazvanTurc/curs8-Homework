package ro.fasttrackit.curs8.homework2.card;

import java.util.Random;
import java.util.Scanner;

public class Card extends Person{

    private final long cardNr;
    private final int PIN;
    private int sold;

    public Card() {
        super();
        this.PIN    = inputPIN("Please enter your new PIN: ");
        this.cardNr = generateCardNr();
    }

    public int inputPIN(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);

        int pin = sc.nextInt();

        while(String.valueOf(pin).length() != 4){
            System.out.println("Please enter a valid PIN consisting of 4 numbers: ");
            pin = sc.nextInt();
        }
        return pin;
    }

    public long generateCardNr() {
        Random random = new Random();

        return random.nextLong(
                1000_0000_0000_0000L,
                9999_9999_9999_9999L);
    }

    public long getCardNr()              { return cardNr; }
    public String getHolderName()        { return super.getName(); }
    public int getSold()                 { return sold; }
    public int getPIN()                  { return PIN; }

    public void addSold(int amount) {
        if (amount > 0) {
            this.sold += amount;
        }else {
            System.out.println("Something is not right.");
        }
    }

    public void subtractSold(int amount) {
        if (amount < 1 || amount > this.sold) {
            System.out.println("Something went wrong, please try again.");
        } else {
            this.sold -= amount;
        }
    }
}
