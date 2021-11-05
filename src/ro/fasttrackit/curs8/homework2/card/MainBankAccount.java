package ro.fasttrackit.curs8.homework2.card;

import ro.fasttrackit.curs8.homework2.banks.BankBRD;

public class MainBankAccount {
    public static void main(String[] args) {
        BankBRD razvanTurcBRD = new BankBRD("Turc Razvan");
        BankBRD razvanTurcBT = new BankBRD(null);

        System.out.println(razvanTurcBRD.sold());

        razvanTurcBRD.deposit(200);
        System.out.println("\n" + razvanTurcBRD.sold());

        razvanTurcBRD.withDraw(110);
        System.out.println("\n" + razvanTurcBRD.sold());

        // Testing errors
        razvanTurcBRD.withDraw(1100);
        razvanTurcBRD.withDraw(-2);
        razvanTurcBRD.deposit(0);

        System.out.println(razvanTurcBT.sold());
    }
}
