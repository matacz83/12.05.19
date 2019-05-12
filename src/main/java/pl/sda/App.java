package pl.sda;

import pl.sda.Utils.SDACreditCardUtils;
import pl.sda.Utils.ValidationResult;
import pl.sda.issuers.IssuerDetector;
import pl.sda.verifiers.LuhnVerifier;

public class App
{
    public static void main( String[] args )
    {
        String cardNumber = "373584610377212";

        SDACreditCardUtils sdaCreditCardUtils = new SDACreditCardUtils();

        ValidationResult validationResult = sdaCreditCardUtils.validate(cardNumber);

        System.out.println("Karta o numerze: " + cardNumber + " została wydana przez: " + validationResult.getName() + " ( " + validationResult.isChecksumValidation() + " ) ");
    }
}
