package ro.fasttrackit.curs8.homework2.card;

import ro.fasttrackit.curs8.homework2.banks.BankBRD;

public class MainBankAccount {
    public static void main(String[] args) {
        Card razvanTurc = new Card();
        BankBRD rTurcBRDCard = new BankBRD(razvanTurc);

        System.out.println(rTurcBRDCard.bankName());
        System.out.println(rTurcBRDCard.checkSold());
        rTurcBRDCard.deposit();

        System.out.println(rTurcBRDCard.checkSold());

        rTurcBRDCard.withDraw();

        System.out.println(rTurcBRDCard.checkSold());
    }
}
