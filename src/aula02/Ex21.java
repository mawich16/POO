package aula02;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        double conversionRate = 1.609;
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos quilometros? ");
        double kms = sc.nextDouble();
        sc.close();

        double miles = kms / conversionRate;
        System.out.println("esse valor é equivalente a " + miles + " milhas");
    }
}
