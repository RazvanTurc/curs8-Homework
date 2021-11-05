package ro.fasttrackit.curs8.homework2.card;

import java.util.Random;
import java.util.Scanner;

public class Card {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    private final Person person;
    private final long cardNr;
    private final int PIN;
    private int sold;

    public Card(Person person) {
        this.person = person;
        this.PIN = inputPIN("Please enter your new PIN: ");
        cardNr = random.nextLong(
                1000_0000_0000_0000L,
                9999_9999_9999_9999L);

    }

    public int inputPIN(String msg) {
        System.out.print(msg);
        int pin = sc.nextInt();

        while(String.valueOf(pin).length() != 4){
            System.out.println("Please enter a valid PIN consisting of 4 numbers: ");
            pin = sc.nextInt();
        }
        return pin;
    }

    public long getCardNr()       { return cardNr; }
    public int getPIN()           { return PIN; }
    public String getHolderName() { return person.getName(); }
    public int getSold()          { return sold; }
    public void setSold(int sold) {
        if(sold > 0) {
            this.sold = sold;
        }else {
            System.out.println("The opperation could not be finished.");
        }
    }
}
