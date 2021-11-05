package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;
import ro.fasttrackit.curs8.homework2.card.Card;
import ro.fasttrackit.curs8.homework2.card.Person;

public class BankBRD implements Bank {
    private Card cardBRD;

    public BankBRD(String fullName) {
        cardBRD = new Card(new Person(fullName));
    }

    @Override
    public String bankName() {
        return "BRD";
    }

    @Override
    public int sold() {
        System.out.print(
                bankName() +
                        " Card Number: " + cardBRD.getCardNr() + "\n" +
                        cardBRD.getHolderName() + " your balance is: ");

        return cardBRD.getSold();
    }

    @Override
    public void withDraw(int amount) {
        if (amount < 1 || amount > cardBRD.getSold()) {
            System.out.println("Something went wrong, please try again.");
        } else {
            cardBRD.setSold(cardBRD.getSold() - amount);
        }
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            cardBRD.setSold(cardBRD.getSold() + amount);
        }else {
            System.out.println("Something is not right.");
        }
    }
}
