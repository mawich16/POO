package aula03;

import utils.UserInput;


public class Ex31 {
    public static void main(String[] args) {
        int number = UserInput.intPositiveValue("please insert a positive number: ");
        int sum = 0;

        for (int i=1; i<=number; i++) {
            boolean result = UserInput.isPrimeNumber(i);

            if (result == true) {
                sum += i;
            }
        }

        System.out.print("the sum of the prime numbers was " + sum);
    }
}
