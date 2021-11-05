package ro.fasttrackit.curs8.homework1.advertisement;

public class Expeditor {
    private Advertisement advertisement;
    public Expeditor(Advertisement advertisement) { this.advertisement = advertisement; }

    public void sendAddvertisement(String msg, String companyName) {
        advertisement.advertise("Advertisment: " + msg);
        advertisement.compName("Company Name: " + companyName);
        System.out.println("Sent Via: " + advertisement.sentVia());
        System.out.println("Cost: " + advertisement.cost() + "\n");
    }
}
