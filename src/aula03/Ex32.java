package aula03;

import java.util.Scanner;

import utils.UserInput;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double value = UserInput.MultipleOfThousand_PositiveValue("Insert invested amount: ");

        System.out.println("Insert tax value: ");
        Double tax = sc.nextDouble();
        while (tax<0 || tax>5) {
            System.out.println("Invalid number. Please try again: ");
            tax = sc.nextDouble();
        }

        double TAX_VALUE = tax/100;

        for (int i=1; i<=12; i++) {
            value += (value * TAX_VALUE);
            System.out.println("On the " + i + "º month the investment value was " + value);
        }
        sc.close();
    }
}
