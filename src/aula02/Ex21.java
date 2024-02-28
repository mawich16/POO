package aula02;

import utils.UserInput;

public class Ex21 {
    public static void main(String[] args) {
        double conversionRate = 1.609;
        double kms = UserInput.doublePositiveValue("quantos quilometros? ");

        double miles = kms / conversionRate;
        System.out.println("esse valor é equivalente a " + miles + " milhas");
    }
}
