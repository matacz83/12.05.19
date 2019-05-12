package pl.sda;

import pl.sda.issuers.IssuerDetector;
import pl.sda.verifiers.LuhnVerifier;

public class App
{
    public static void main( String[] args )
    {
        String cardNumber = "373584610377212";

        IssuerDetector issuerDetector = new IssuerDetector();
        String issuer = issuerDetector.detect(cardNumber);

        LuhnVerifier verifier = new LuhnVerifier();
        boolean verify = verifier.verify(cardNumber);

        System.out.println("Karta o numerze: " + cardNumber + " została wydana przez: " + issuer + " ( " + verify + " ) ");
    }
}
