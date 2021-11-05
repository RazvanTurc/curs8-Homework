package ro.fasttrackit.curs8.homework1.advertisement;

import ro.fasttrackit.curs8.homework1.sender.EmailSender;
import ro.fasttrackit.curs8.homework1.sender.PrintSender;
import ro.fasttrackit.curs8.homework1.sender.SocialMediaSender;

public class MainAddSender {
    public static void main(String[] args) {
        Advertisement transportExpressSocialM = new SocialMediaSender("FaceBook");
        Advertisement transportExpressEmail = new EmailSender();
        Advertisement transportExpressPrintFax = new PrintSender();

        Expeditor transportExpressMail = new Expeditor(transportExpressEmail);
        transportExpressMail.sendAddvertisement(
                "Execut transporturi !",
                "Transport Express"
        );

        Expeditor transportExpressSocial = new Expeditor(transportExpressSocialM);
        transportExpressSocial.sendAddvertisement(
                "Execut transporturi !",
                "Transport Express"
        );

        Expeditor transportExpressPrint = new Expeditor(transportExpressPrintFax);
        transportExpressPrint.sendAddvertisement(
                "Execut transporturi !",
                "Transport Express"
        );

    }
}
