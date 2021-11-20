package ro.fasttrackit.curs8.homework2.card;

import ro.fasttrackit.curs8.homework2.banks.BankBRD;
import ro.fasttrackit.curs8.homework2.banks.BankBT;
import ro.fasttrackit.curs8.homework2.banks.BankING;

public class MainBankAccount {
    public static void main(String[] args) {

        Person razvanTurc = new Person(new BankBRD());

        razvanTurc.checkSold();

        razvanTurc.deposit();
        razvanTurc.checkSold();

        razvanTurc.withDraw();
        razvanTurc.checkSold();


        razvanTurc.deposit();
        razvanTurc.checkSold();

        razvanTurc.withDraw();
        razvanTurc.checkSold();
    }
}
