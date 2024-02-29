package utils;

import java.util.Scanner;

public class UserInput {
    public static Double doublePositiveValue(String stringRequest) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringRequest);
        double value = sc.nextDouble();

        while (value <= 0) {
            System.out.println("Invalid number. Please try again: ");
            value = sc.nextDouble();
        }
        return value;
    }




    public static Integer intPositiveValue(String stringRequest) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringRequest);
        int value = sc.nextInt();

        while (value <= 0) {
            System.out.println("Invalid number. Please try again: ");
            value = sc.nextInt();
        }
        return value;
    }




    public static Double MultipleOfThousand_PositiveValue(String stringRequest) {
        Scanner sc = new Scanner(System.in);
        System.out.println(stringRequest);
        Double value = sc.nextDouble();

        while (value <= 0 || value % 1000 != 0) {
            System.out.println("Invalid number. Please try again: ");
            value = sc.nextDouble();
        }
        return value;
    }




    public static Boolean isPrimeNumber(int number) {
        int j=0;

        for (int i=1; i<=number; i++) {
            if (number % i == 0) {
                j += 1;
            }
        }

        if (j == 2) {
            return true;
        }
        else {
            return false;
        }
    }




    public static Double grades(double gradeT, double gradeP) {
        double finalGrade;

        finalGrade = 0.4 * gradeT + 0.6 * gradeP;

        return finalGrade;
    }
}
