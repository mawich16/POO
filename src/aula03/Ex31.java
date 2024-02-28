package aula03;

import utils.UserInput;


public class Ex31 {
    public static void main(String[] args) {
        int number = UserInput.intPositiveValue("please insert a positive number: ");
        boolean result = UserInput.isPrimeNumber(number);

        if (result == true) {
            System.out.print("the insert number is prime");
        }
        else {
            System.out.print("the insert number is not prime");
        }
    }
}
