package ro.fasttrackit.curs8.homework1.sender;

import ro.fasttrackit.curs8.homework1.advertisement.Advertisement;

public class SocialMediaSender implements Advertisement {

    private String socialMedia;

    public SocialMediaSender(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public void viewCompanyName(String companyName) { System.out.println(companyName); }

    public void advertise(String msg)               { System.out.println(msg); }

    public String sentVia()                         { return "Social Media -> " + socialMedia; }

    public int cost()                               { return 11; }
}
