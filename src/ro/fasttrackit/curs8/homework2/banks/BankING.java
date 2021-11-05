package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;
import ro.fasttrackit.curs8.homework2.card.Card;
import ro.fasttrackit.curs8.homework2.card.Person;

public class BankING implements Bank {
    private Card cardING;

    public BankING(String fullName) {
        cardING = new Card(new Person(fullName));
    }

    @Override
    public String bankName() {
        return "BT";
    }

    @Override
    public int sold() {
        System.out.print(
                bankName() +
                        " Card Number: " + cardING.getCardNr() + "\n" +
                        cardING.getHolderName() + " your balance is: ");

        return cardING.getSold();
    }

    @Override
    public void withDraw(int amount) {
        if(amount < 0 || amount > cardING.getSold()) {
            System.out.println("Something went wrong, please try again.");
        } else {
            cardING.setSold(cardING.getSold() - amount);
        }
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            cardING.setSold(cardING.getSold() + amount);
        }else {
            System.out.println("Something is not right.");
        }
    }

}
