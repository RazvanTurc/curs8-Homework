package ro.fasttrackit.curs8.homework2.banks;

import java.util.Scanner;

public class Inputs {

    Scanner sc = new Scanner(System.in);

    public int pin() {
        return sc.nextInt();
    }

    public int newPin(String msg) {
        System.out.print(msg);
        int pin = sc.nextInt();

        while (String.valueOf(pin).length() != 4) {
            System.out.print("Please enter a valid PIN consisting of 4 numbers: ");
            pin = sc.nextInt();
        }
        System.out.print("Please reenter the PIN: ");
        int tempPin = sc.nextInt();

        while (tempPin != pin) {
            System.out.print("Incorrect PIN, please try again: ");
            tempPin = sc.nextInt();
        }
        return pin;
    }

    public int amount(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

}
