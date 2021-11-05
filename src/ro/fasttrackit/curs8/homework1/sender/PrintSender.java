package ro.fasttrackit.curs8.homework1.sender;

import ro.fasttrackit.curs8.homework1.advertisement.Advertisement;

public class PrintSender implements Advertisement {

    public void compName(String companyName) { System.out.println(companyName); }

    public void advertise(String msg)        { System.out.println(msg); }

    public String sentVia()                  { return "Print/Fax"; }

    public int cost()                        { return 3; }
}
