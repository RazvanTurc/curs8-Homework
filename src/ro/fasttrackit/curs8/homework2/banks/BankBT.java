package ro.fasttrackit.curs8.homework2.banks;

import ro.fasttrackit.curs8.homework2.card.Bank;
import ro.fasttrackit.curs8.homework2.card.Card;
import ro.fasttrackit.curs8.homework2.card.Person;

public class BankBT implements Bank {
    private Card cardBT;

    public BankBT(String fullName) {
        cardBT = new Card(new Person(fullName));
    }

    @Override
    public String bankName() {
        return "BT";
    }

    @Override
    public int sold() {
        System.out.print(
                bankName() +
                        " Card Number: " + cardBT.getCardNr() + "\n" +
                        cardBT.getHolderName() + " your balance is: ");

        return cardBT.getSold();
    }

    @Override
    public void withDraw(int amount) {
        if(amount < 0 || amount > cardBT.getSold()) {
            System.out.println("Something went wrong, please try again.");
        } else {
            cardBT.setSold(cardBT.getSold() - amount);
        }
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            cardBT.setSold(cardBT.getSold() + amount);
        }else {
            System.out.println("Something is not right.");
        }
    }
}
