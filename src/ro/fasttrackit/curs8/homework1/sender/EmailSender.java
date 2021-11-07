package ro.fasttrackit.curs8.homework1.sender;

import ro.fasttrackit.curs8.homework1.advertisement.Advertisement;

public class EmailSender implements Advertisement {

    public void viewCompanyName(String companyName) { System.out.println(companyName); }

    public void advertise(String msg)               { System.out.println(msg); }

    public String sentVia()                         { return "Email"; }

    public int cost()                               { return 6; }
}
